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
    private ArrayList<Integer> ll = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {// inorder traversal of binary search tree gives a sorted array
        // ll.clear(); 
        inorder(root);

        for (int i = 0; i < ll.size() - 1; i++) {
            if (ll.get(i) >= ll.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        ll.add(node.val);
        inorder(node.right);
    }
}