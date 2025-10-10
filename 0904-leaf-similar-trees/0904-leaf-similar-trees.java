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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ll = new ArrayList<>();
        ArrayList<Integer> ll2 = new ArrayList<>();

        DFS(root1,ll);
        DFS(root2,ll2);

        if(ll.equals(ll2)) return true;
        return false;
        
    }
    public static void DFS(TreeNode root,ArrayList<Integer> ll){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ll.add(root.val);
        }
        DFS(root.left,ll);
        DFS(root.right,ll);
    }
}