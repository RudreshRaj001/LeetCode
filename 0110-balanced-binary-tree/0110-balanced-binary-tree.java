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
        if (root == null) {
            return true;
        }
        return h(root) != -1;
    }
    private int h(TreeNode root){
        if (root == null) {
            return 0;
        }
        int rh = h(root.right);
        int lh = h(root.left);
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh - rh) > 1) return -1;
        return Math.max(rh , lh) + 1;
    }
}


  