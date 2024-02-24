

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
        ArrayDeque<TreeNode> currLevel = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque<>() {{ offer(root);}};

        ArrayList<Integer> rightside  = new ArrayList<Integer>();
        TreeNode node = null;
        while(!nextLevel.isEmpty() ) {
            currLevel = nextLevel;
            nextLevel = new ArrayDeque();

            while(!currLevel.isEmpty()) {
                node = currLevel.poll();

                if(node.left!=null) nextLevel.add(node.left);
                if(node.right!=null) nextLevel.add(node.right);


            }
            if(currLevel.isEmpty())
                rightside.add(node.val);
        }
       return rightside; 
    }  
}
