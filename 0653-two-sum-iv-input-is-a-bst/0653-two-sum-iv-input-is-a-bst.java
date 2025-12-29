class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        inorder(root, ll);

        int a = 0, b = ll.size() - 1;
        while (a < b) {
            int sum = ll.get(a) + ll.get(b);
            if (sum == k) return true;
            else if (sum > k) b--;
            else a++;
        }
        return false;
    }

    public void inorder(TreeNode root, ArrayList<Integer> ll) {
        if (root == null) return;

        inorder(root.left, ll);
        ll.add(root.val);
        inorder(root.right, ll);
    }
}
