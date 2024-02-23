

import com.sun.source.tree.Tree;

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
    public List<Integer> rightSideView(TreeNode root) {
       if(root==null)
            return new ArrayList<Integer>();

        ArrayDeque<TreeNode> currlevel = new ArrayDeque<>();
        ArrayDeque<TreeNode> nextlevel = new ArrayDeque<>() {{
            offer(root);
        }};
        List<Integer> rightside = new ArrayList<>();
        TreeNode node = null;
        while(!nextlevel.isEmpty()) {
            currlevel= nextlevel;
            nextlevel =new ArrayDeque<>();

            while(!currlevel.isEmpty()) {
               node =currlevel.poll();

                if(node.left !=null)
                    nextlevel.offer(node.left);
                if(node.right!=null)
                    nextlevel.offer(node.right);
            }
            if(currlevel.isEmpty())
                rightside.add(node.val);
        }
        return rightside;


        
    }
}
