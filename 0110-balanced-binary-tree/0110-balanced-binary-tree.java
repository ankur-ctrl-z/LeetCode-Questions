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
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    public int checkBalance(TreeNode root){
        if(root == null) return 0;

        int leftHeight = checkBalance(root.left);
        if(leftHeight == -1) return -1;

        int RightHeight = checkBalance(root.right);
        if(RightHeight == -1) return -1;

        if(Math.abs(leftHeight - RightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight,RightHeight);
    }
}