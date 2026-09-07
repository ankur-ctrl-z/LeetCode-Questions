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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return calculate(0, nums.length-1, nums); 
    }
    public static TreeNode calculate(int left, int right, int nums[]){
        if(left > right) return null;
        int maxIdx = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        TreeNode tree = new TreeNode(nums[maxIdx]);

        tree.left = calculate(left,maxIdx-1, nums);
        tree.right = calculate(maxIdx +1, right, nums);

        return tree;
    }
}