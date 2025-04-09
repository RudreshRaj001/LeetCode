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
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        trav(root, list);

        TreeNode t = root;
        for (int i = 1; i < list.size(); i++) {
            t.right = list.get(i);
            t.left = null;
            t = t.right;
        }
    }

    private void trav(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        trav(root.left, list);
        trav(root.right, list);

        return;
    }
}