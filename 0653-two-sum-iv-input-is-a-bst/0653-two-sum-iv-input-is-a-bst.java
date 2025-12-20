class Solution {
    static ArrayList<Integer> ll = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        ll.clear(); 
        sum(root);
         int a = 0;
         int b = ll.size()-1;

         while(a < b){
            if(ll.get(a) + ll.get(b) == k) return true;
            else if(ll.get(a) + ll.get(b) > k){
                b--;
            } else {
                a++;
            }
         } 
         return false; 
    }
    public static void sum(TreeNode root){
        if(root == null){
            return;
        }

        sum(root.left);
        ll.add(root.val);
        sum(root.right);
    }
}