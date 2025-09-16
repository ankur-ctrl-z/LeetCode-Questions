class Solution {
    public List<Integer> replaceNonCoprimes(int[] arr) {
        ArrayList<Integer> ll = new ArrayList<>();
        for (int num : arr) {
            ll.add(num);
        }
        int i = 0;
        int j = 1;
        while(j < ll.size()){
            if(gcd(ll.get(i),ll.get(j)) > 1) { 
                ll.set(i,lcm(ll.get(i),ll.get(j)));
                ll.remove(j);
                if(i > 0) {
                    i--;
                    j--;
                }
            } else {
                i++;
                j++;
            }
        }
        return ll;
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;  
    }
}