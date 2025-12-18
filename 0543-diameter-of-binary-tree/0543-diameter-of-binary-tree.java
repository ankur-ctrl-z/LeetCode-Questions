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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int a = diameterOfBinaryTree(root.left);
        int b = diameterOfBinaryTree(root.right);

        int c = height(root.left) + height(root.right) + 2;
        return Math.max(c,Math.max(a,b));
    }
    public static int height(TreeNode root){
        if(root == null){
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}