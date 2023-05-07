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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // if(root==null)
        // return false;
        // if(root.left==null && root.right==null && targetSum-root.val==0)
        // return true;
        // return hasPathSum(root.left,targetSum-root.val)||
        // hasPathSum(root.right,targetSum-root.val);
        if(root==null)
        return false;
        Stack<TreeNode> nodes=new Stack<>();
        Stack<Integer> sum=new Stack<>();
        nodes.add(root);
        sum.add(targetSum-root.val);
        TreeNode node;
        int curr_sum;
        while(!nodes.empty())
        {
            node=nodes.pop();
            curr_sum=sum.pop();
            if(node.left==null && node.right==null && curr_sum==0)
            return true;
            if(node.right!=null){
            nodes.add(node.right);
            sum.add(curr_sum-node.right.val);

            }
            if(node.left!=null){
            nodes.add(node.left);
            sum.add(curr_sum-node.left.val);
            }

        }
        return false;
    }
}
