/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        solve(root,pq);
while (--k > 0) {
    pq.poll();
}
return pq.poll();

    }
    public static void solve(TreeNode root,PriorityQueue<Integer>pq){
       if (root == null) return;
        pq.add(root.val);
        solve(root.left, pq);
        solve(root.right, pq);
    }
}