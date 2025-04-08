/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node n = root;
        if (root == null) {
            return n;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            Node currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            for (int i = 1; i < levelSize; i++) {
                Node newNode = queue.poll();
                currentNode.next = newNode;
                if (newNode.left != null) {
                    queue.offer(newNode.left);
                }
                if (newNode.right != null) {
                    queue.offer(newNode.right);
                }
                currentNode = newNode;
            }

        }

        return n;
    }
}