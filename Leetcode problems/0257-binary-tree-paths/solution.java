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
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        if(root==null)
            return paths;
        
        LinkedList<TreeNode> node_stack = new LinkedList<>();
        LinkedList<String> path_stack = new LinkedList<>();
        node_stack.add(root);
        path_stack.add(Integer.toString(root.val));
        TreeNode node;
        String path;

        while(!node_stack.isEmpty()) {
            node = node_stack.pollLast();
            path = path_stack.pollLast();
            if(node.left==null && node.right==null)
                paths.add(path);
            if(node.left!=null) {
                node_stack.add(node.left);
                path_stack.add(path+"->"+node.left.val);
            } 
            if(node.right!=null) {
                node_stack.add(node.right);
                path_stack.add(path+"->"+node.right.val);
            }

        }   
        return paths;     
    }
}
