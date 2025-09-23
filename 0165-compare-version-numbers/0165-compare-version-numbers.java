class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> parts1 = new ArrayList<>();
        ArrayList<Integer> parts2 = new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < version1.length(); i++) {
            char ch = version1.charAt(i);
            if (ch != '.') {
                temp.append(ch);
            } else {
                parts1.add(Integer.parseInt(temp.toString()));
                temp.setLength(0);
            }
        }
        if (temp.length() > 0) parts1.add(Integer.parseInt(temp.toString()));
        while (!parts1.isEmpty() && parts1.get(parts1.size() - 1) == 0) {
            parts1.remove(parts1.size() - 1);
        }

        temp.setLength(0);

        for (int i = 0; i < version2.length(); i++) {
            char ch = version2.charAt(i);
            if (ch != '.') {
                temp.append(ch);
            } else {
                parts2.add(Integer.parseInt(temp.toString()));
                temp.setLength(0);
            }
        }
        if (temp.length() > 0) parts2.add(Integer.parseInt(temp.toString()));
        while (!parts2.isEmpty() && parts2.get(parts2.size() - 1) == 0) {
            parts2.remove(parts2.size() - 1);
        }

        int n = Math.max(parts1.size(), parts2.size());
        for (int i = 0; i < n; i++) {
            int v1 = i < parts1.size() ? parts1.get(i) : 0;
            int v2 = i < parts2.size() ? parts2.get(i) : 0;

            if (v1 < v2) return -1;
            if (v1 > v2) return 1;
        }

        return 0;
    }
}
