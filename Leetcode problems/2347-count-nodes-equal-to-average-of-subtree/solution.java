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
     int result;
    public int averageOfSubtree(TreeNode root) {
       helper(root);
       return result;


    }
    public int[] helper(TreeNode root)
    {
        if(root==null)
        return new int[]{0,0};
        int[] left=helper(root.left);
        int[] right=helper(root.right);
        int sum=root.val+left[1]+right[1];
        int count=1+left[0]+right[0];
        if(root.val==(sum/count))
        result++;
        return new int[]{count,sum};
    }
}
