// class Solution {
//     public String largestGoodInteger(String s) {
//         ArrayList<Character> ll = new ArrayList<>();
//         int i = 0;
//         int j = 1;
//         int k = 2;

//         while(k < s.length()){
//             if(s.charAt(i) == s.charAt(j) && s.charAt(i) == s.charAt(k)){
//                ll.add(s.charAt(i));
//             }
//             i++;
//             j++;
//             k++;
//         }
//         Collections.sort(ll);
//         if(ll.isEmpty()) return "";
//         char num = ll.get(ll.size()-1);
//         String number = num+""+num+""+num;
//         return number;
//     }
// }



class Solution {
    public String largestGoodInteger(String num) {
        String[] str={"999","888","777","666","555","444","333","222","111","000"};
        for(String s:str){
            if(num.contains(s)){
                return s;
            }
        }
        return "";
    }
}