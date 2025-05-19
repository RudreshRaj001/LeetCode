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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        int[] index = {0};
        return helper(preorder, inorder, 0, preorder.length - 1, map, index);
    }

    private TreeNode helper(int[] preorder, int[] inorder,int l, int r, HashMap<Integer, Integer> map, int[] index){
        if(l > r) return null;
        if(index[0] >= preorder.length) return null;
        int cur = preorder[index[0]];
        TreeNode node = new TreeNode(cur);
        int curInd = map.get(cur);
        index[0]++;
        node.left = helper(preorder, inorder, l, curInd - 1, map, index);
        node.right = helper(preorder, inorder, curInd + 1, r, map, index);

        return node;
    }
}