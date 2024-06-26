


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
    private int numGoodNodes=0;
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return numGoodNodes;
    }
    private void dfs(TreeNode node, int max){
        if(max<=node.val)
            numGoodNodes++;
        if(node.left!=null) dfs(node.left, Math.max(max, node.val));
        if(node.right!=null) dfs(node.right, Math.max(max, node.val));

    }
}
