package Array;

public class Kth_Root {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 150;
        int k = 2;
        System.out.println(KthRoot(n, k));

    }

    public static int KthRoot(int n, int k) {
        int lo = 1;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (Math.pow(mid, k) <= n) {
                // we are updating ans here and modifying lo because if we find this if check
                // true but we need the highest one who can satisfy this if check and always
                // thing this will not go in an infinte loop because somewhere lo will be higher
                // than hi and loop will exit
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

}
