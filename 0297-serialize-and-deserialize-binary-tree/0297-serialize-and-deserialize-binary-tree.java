/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString().trim();
    }

    private void helper(TreeNode root, StringBuilder sb){
        if(root == null){ 
            sb.append(" $");
            return; 
        }
        sb.append(" ").append(root.val);
        helper(root.left, sb);
        helper(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(" ");
        int[] i = new int[1];
        i[0] = 0;
        return helper2(arr, i);
    }
    private TreeNode helper2(String[] preorder, int[] i){
        if(i[0] == preorder.length) return null;
        if(preorder[i[0]].equals("$")){
            i[0]++;
            return null;
        }
        int value = Integer.parseInt(preorder[i[0]]);
        i[0]++;
        TreeNode root = new TreeNode(value);
        root.left = helper2(preorder, i);
        root.right = helper2(preorder, i);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));