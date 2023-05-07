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
    public int minDepth(TreeNode root) {
    //    if(root==null)
    //    return 0;
    //    if((root.left==null)&&(root.right==null)){
    //        return 1;
    //    }
    //    int min_depth=Integer.MAX_VALUE;
    //    if(root.left!=null)
    //    min_depth=Math.min(minDepth(root.left),min_depth);
    //    if(root.right!=null)
    //    min_depth=Math.min(minDepth(root.right),min_depth);
    //     return min_depth+1;
        /*bfs approach*/
        if(root==null)
        return 0;
        LinkedList<Pair<TreeNode,Integer>> queue=new LinkedList<>();
        queue.add(new Pair(root,1));
        int currentdepth=0;
        while(!queue.isEmpty())
        {
            Pair<TreeNode,Integer> current=queue.poll();
            root=current.getKey();
            currentdepth=current.getValue();
            if((root.left==null)&&(root.right==null))
                break;
                if(root.left!=null)
                queue.add(new Pair(root.left,currentdepth+1));
                if(root.right!=null)
                queue.add(new Pair(root.right,currentdepth+1));
            }
        
        return currentdepth;

    }
}
