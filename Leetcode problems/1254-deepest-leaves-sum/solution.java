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
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        int deepestLevel = findDeepestLevel(root);
        return calculateSum(root, 1, deepestLevel);
        
        
    }
    private int findDeepestLevel(TreeNode root) {
        if(root == null)
            return 0;
        int leftLevel = findDeepestLevel(root.left);
        int rightLevel = findDeepestLevel(root.right);
        return Math.max(leftLevel, rightLevel)+1;
        
    }
    private int calculateSum(TreeNode root, int currentLevel, int DeepestLevel ) {
        if(root ==null)
            return 0;
        if(currentLevel==DeepestLevel)
            return root.val;
        int leftVal = calculateSum(root.left, currentLevel+1, DeepestLevel);
        int rightVal = calculateSum(root.right, currentLevel+1, DeepestLevel);
        return leftVal+rightVal;
    }
}
