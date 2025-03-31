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
    public void recoverTree(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorderTraversal(root, in);
        Collections.sort(in);

        int[] index = {0}; 
        restoreTree(root, in, index);
    }

     private void restoreTree(TreeNode root, List<Integer> in, int[] index) {
        if (root == null) return;
        restoreTree(root.left, in, index);
        root.val = in.get(index[0]++);
        restoreTree(root.right, in, index);
    }

    private void inorderTraversal(TreeNode root, List<Integer> in) {
        if (root == null) return;
        inorderTraversal(root.left, in);
        in.add(root.val);
        inorderTraversal(root.right, in);
    }
}