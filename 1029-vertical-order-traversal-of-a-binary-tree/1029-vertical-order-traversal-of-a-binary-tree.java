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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        traverse(root, 0, 0, map);

        List<List<Integer>> result = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> column = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    column.add(nodes.poll());
                }
            }
            result.add(column);
        }
        return result;
    }

    private void traverse(TreeNode node, int x, int y,
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
        if (node == null)
            return;
        map.putIfAbsent(x, new TreeMap<>());
        map.get(x).putIfAbsent(y, new PriorityQueue<>());

        map.get(x).get(y).offer(node.val);

        traverse(node.left, x - 1, y + 1, map);
        traverse(node.right, x + 1, y + 1, map);
    }
}