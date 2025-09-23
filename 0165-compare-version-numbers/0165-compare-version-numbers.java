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

        int n = Math.max(parts1.size(), parts2.size());

        for (int i = 0; i < n; i++) {
            int l1 = 0;
            int l2 = 0;
            if(i < parts1.size()){
                l1 = parts1.get(i);
            } else {
                l1 = 0;
            }

            if(i < parts2.size()){
                l2 = parts2.get(i);
            } else {
                l2 = 0;
            }
            
            if(l1 == l2) continue;
            if (l1 < l2) return -1;
            if (l1 > l2) return 1;
        }

        return 0;
    }
}