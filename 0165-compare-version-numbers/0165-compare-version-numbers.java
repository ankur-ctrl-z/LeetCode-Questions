class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> ll1 = new ArrayList<>();
        ArrayList<Integer> ll2 = new ArrayList<>();

        StringBuilder st = new StringBuilder();
        for(int i = 0; i < version1.length(); i++){
            char ch = version1.charAt(i);
            if(ch != '.'){
                st.append(ch);
            }else {
                ll1.add(Integer.parseInt(st.toString()));
                st.setLength(0);
            }
        }
        if(st.length() > 0) {
            ll1.add(Integer.parseInt(st.toString()));
        }

        st.setLength(0);

        for(int i = 0; i < version2.length(); i++){
            char ch = version2.charAt(i);
            if(ch != '.'){
                st.append(ch);
            }else {
                ll2.add(Integer.parseInt(st.toString()));
                st.setLength(0);
            }
        }
        if(st.length() > 0) {
            ll2.add(Integer.parseInt(st.toString()));
        }

        int n = Math.max(ll1.size(), ll2.size());
        for(int i = 0; i < n; i++){
            int l1 = 0;
            int l2 = 0;
            if(i < ll1.size()){
                l1 = ll1.get(i);
            }else {
                l1 = 0;
            }
            if(i < ll2.size()){
                l2 = ll2.get(i);
            }else {
                l2 = 0;
            }

            if(l1 < l2) return -1;
            if(l1 > l2) return 1;
        }
        return 0;
    }
}