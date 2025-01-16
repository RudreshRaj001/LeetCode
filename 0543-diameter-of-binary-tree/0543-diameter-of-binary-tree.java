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
        int[] max = new int[1];
        max[0] = 0;
        h(root, max);
        return max[0];
    }
    public int h(TreeNode root, int[] max){
        if (root == null) {
            return 0;
        }
        int rh = h(root.right, max);
        int lh = h(root.left, max);
        max[0] = Math.max(rh + lh, max[0]); 
        return Math.max(rh , lh) + 1;
    }
}