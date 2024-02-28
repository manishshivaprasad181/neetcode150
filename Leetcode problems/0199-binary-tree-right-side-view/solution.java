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
        List<Integer> rightList =new ArrayList<>();
        if(root==null)
            return new ArrayList<>();
        ArrayDeque<TreeNode> currList = new ArrayDeque<>();
        ArrayDeque<TreeNode> nextList = new ArrayDeque<>(){{offer(root);}};
        

        TreeNode node = null;
        
        while(!nextList.isEmpty()){
            currList = nextList;
            nextList = new ArrayDeque<>();

            while(!currList.isEmpty()) {
                node = currList.pop();

                if(node.left!=null) nextList.add(node.left);
                if(node.right!=null) nextList.add(node.right);
            }
            if(currList.isEmpty())
                rightList.add(node.val);
        
        }
        return rightList;
        
        
    }
}
