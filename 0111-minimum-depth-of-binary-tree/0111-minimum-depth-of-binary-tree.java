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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int[] d = { Integer.MAX_VALUE };
        helper(root, d, 1);
        return d[0];
    }

    private void helper(TreeNode root, int[] d, int depth) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            d[0] = Math.min(d[0], depth);
            return;
        }
        depth++;
        helper(root.left, d, depth);
        helper(root.right, d, depth);
    }
}