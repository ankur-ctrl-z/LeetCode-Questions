class TaskManager {
    private class Task {
        int userId;
        int priority;

        Task(int userId, int priority) {
            this.userId = userId;
            this.priority = priority;
        }
    }

    private class Entry {
        int userId;
        int taskId;
        int priority;

        Entry(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }


    private PriorityQueue<Entry> pq = new PriorityQueue<>(
        (a, b) -> a.priority != b.priority ? Integer.compare(b.priority, a.priority) : Integer.compare(b.taskId, a.taskId)
    );
    private Map<Integer, Task> tasksMap = new HashMap<>();

    public TaskManager(List<List<Integer>> tasks) {
        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), priority = t.get(2);

            tasksMap.put(taskId, new Task(userId, priority));
            pq.offer(new Entry(userId, taskId, priority));
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        tasksMap.put(taskId, new Task(userId, priority));
        pq.offer(new Entry(userId, taskId, priority));
    }
    
    public void edit(int taskId, int newPriority) {
        Task task = tasksMap.get(taskId);
        task.priority = newPriority;
        tasksMap.put(taskId, task);
        pq.offer(new Entry(task.userId, taskId, newPriority));
    }
    
    public void rmv(int taskId) {
        tasksMap.remove(taskId);
    }
    
    public int execTop() {
        while (!pq.isEmpty()) {
            Entry top = pq.peek();
            Task curr = tasksMap.get(top.taskId);

            if (curr == null || curr.priority != top.priority || curr.userId != top.userId) {
                pq.poll();
                continue;
            }

            pq.poll();
            tasksMap.remove(top.taskId);
            return top.userId;
        }

        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */