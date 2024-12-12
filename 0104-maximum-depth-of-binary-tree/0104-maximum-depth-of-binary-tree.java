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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 1;
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = travel(root.left, depth);
        }
        if(root.right != null){
            right = travel(root.right, depth);
        }
        depth = Math.max(Math.max(left, right), depth);
        return depth;
    }
    private int travel(TreeNode node, int deep){
        if(node == null) return deep;
        deep++;
        int left = travel(node.left, deep);
        int right = travel(node.right, deep);
        deep = Math.max(left, right);
        return deep;
    }
}