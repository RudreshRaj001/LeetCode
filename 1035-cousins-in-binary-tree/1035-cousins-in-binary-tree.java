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
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean samelevel = false;
        boolean notSiblings = true;
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            boolean yesx = false;
            boolean yesy = false;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

                if (currentNode.val == x)
                    yesx = true;
                if (currentNode.val == y)
                    yesy = true;

                if (currentNode.left != null && currentNode.right != null) {
                    if ((currentNode.left.val == x && currentNode.right.val == y) ||
                            (currentNode.left.val == y && currentNode.right.val == x)) {
                        notSiblings = false;
                    }
                }
            }

            if (yesx && yesy)
                samelevel = true;

        }

        return samelevel && notSiblings;
    }
}