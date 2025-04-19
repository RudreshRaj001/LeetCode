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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        // set.add(k);
        return helper(root, k, set);
    }

    private boolean helper(TreeNode root, int k, HashSet<Integer> set) {
        if(root == null) return false;
        if(set.contains(root.val)){
            return true;
        }
        set.add(k - root.val);
        boolean l = helper(root.left, k, set);
        boolean r = helper(root.right, k, set);
        return l || r;
    }
}