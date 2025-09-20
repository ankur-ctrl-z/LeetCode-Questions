import java.util.*;

class Router {
    private int memoryLimit;
    private Queue<int[]> queue;
    private Set<String> packetSet;
    private Map<Integer, TreeMap<Integer, Integer>> destTimeCount;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.queue = new LinkedList<>();
        this.packetSet = new HashSet<>();
        this.destTimeCount = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if (packetSet.contains(key)) return false;
        if (queue.size() == memoryLimit) {
            int[] removed = queue.poll();
            String removedKey = removed[0] + "#" + removed[1] + "#" + removed[2];
            packetSet.remove(removedKey);
            TreeMap<Integer, Integer> timeMap = destTimeCount.get(removed[1]);
            timeMap.put(removed[2], timeMap.get(removed[2]) - 1);
            if (timeMap.get(removed[2]) == 0) timeMap.remove(removed[2]);
        }
        queue.offer(new int[]{source, destination, timestamp});
        packetSet.add(key);
        destTimeCount.putIfAbsent(destination, new TreeMap<>());
        TreeMap<Integer, Integer> timeMap = destTimeCount.get(destination);
        timeMap.put(timestamp, timeMap.getOrDefault(timestamp, 0) + 1);
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[0];
        int[] packet = queue.poll();
        String key = packet[0] + "#" + packet[1] + "#" + packet[2];
        packetSet.remove(key);
        TreeMap<Integer, Integer> timeMap = destTimeCount.get(packet[1]);
        timeMap.put(packet[2], timeMap.get(packet[2]) - 1);
        if (timeMap.get(packet[2]) == 0) timeMap.remove(packet[2]);
        return packet;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destTimeCount.containsKey(destination)) return 0;
        TreeMap<Integer, Integer> timeMap = destTimeCount.get(destination);
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : timeMap.subMap(startTime, true, endTime, true).entrySet()) {
            count += entry.getValue();
        }
        return count;
    }
}


/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */