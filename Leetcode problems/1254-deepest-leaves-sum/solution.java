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
        if(root==null)
            return 0;
        int deepestLevel = findDeepestLevel(root);
        return calculateSum(root, 1, deepestLevel);
    }
    private int findDeepestLevel(TreeNode root) {
        if(root ==null)
            return 0;
        int leftMax = findDeepestLevel(root.left);
        int rightMax = findDeepestLevel(root.right);
        return Math.max(leftMax, rightMax)+1;
    }
    private int calculateSum(TreeNode root,int currentLevel, int deepestLevel) {
        if(root==null)
            return 0;
        if(currentLevel==deepestLevel)
            return root.val;
        int left = calculateSum(root.left, currentLevel+1, deepestLevel);
        int right =calculateSum(root.right, currentLevel+1, deepestLevel);
        return left+right;
    }  
}
