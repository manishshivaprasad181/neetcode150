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
      if(root ==null) 
            return 0;
        int deepestLevel = findDeepestLevel(root);
        return calculateSum(root,1, deepestLevel);
        
    }
    private int findDeepestLevel(TreeNode node) {
        if(node == null)
            return 0;
        int leftLevel = findDeepestLevel(node.left);
        int rightLevel =findDeepestLevel(node.right);
        return Math.max(leftLevel, rightLevel) +1;
    }
    private int calculateSum(TreeNode node, int currentLevel, int deepestLevel) {
        if(node == null)
            return 0;
        if(currentLevel == deepestLevel) 
            return node.val;
        
        int leftSum = calculateSum(node.left, currentLevel+1, deepestLevel);
        int rightSum = calculateSum(node.right, currentLevel+1, deepestLevel);
        return leftSum+rightSum;
    }
    
}
