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
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = root.val;
        h(root, max);
        return max[0];
    }
    private int h(TreeNode root, int[] max) {
         if (root == null) {
            return 0;
        }
        int rs = Math.max(h(root.right, max), 0);
        int ls = Math.max(h(root.left, max), 0);
        
        max[0] = Math.max(max[0], root.val + rs + ls);

        return root.val + Math.max(rs, ls);
    }
}