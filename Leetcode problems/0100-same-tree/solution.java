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
    public boolean check(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        return true;
        if(p==null|| q==null)
        return false;
        if(p.val!=q.val)
        return false;
        return true;

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if(p==null && q==null)
        // return true;
        // if(p==null || q==null)
        // return false;
        // if(p.val!=q.val)return false;
        // return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        if(p==null && q==null)
        return true;
        if(!check(p,q))return false;
        Queue<TreeNode> queueP=new LinkedList<>();
        Queue<TreeNode> queueQ=new LinkedList<>();
        queueP.add(p);
        queueQ.add(q);
        while(!queueP.isEmpty())
        {
            p=queueP.poll();
            q=queueQ.poll();
            if(!check(p,q))return false;
            if(p!=null)
            {
                if(!check(p.left,q.left))return false;
                if(p.left!=null){
                queueP.add(p.left);
                queueQ.add(q.left);
            }
            if(!check(p.right,q.right))return false;
            if(p.right!=null)
            {
                queueP.add(p.right);
                queueQ.add(q.right);
            }
        } }
        return true;
    }
}
