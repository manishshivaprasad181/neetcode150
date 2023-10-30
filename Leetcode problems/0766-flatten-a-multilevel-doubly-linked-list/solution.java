/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node(int val)
    {
        this.val=val;
    }
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
        return head;
        Node dummy=new Node(0);
        Node cur=dummy;
        Stack<Node> stack=new Stack<>();
        stack.push(head);
        while(!stack.isEmpty())
        {
            Node temp=stack.pop();
            if(temp.next!=null)
            {
                stack.push(temp.next);
            }
            if(temp.child!=null)
            {
                stack.push(temp.child);
            }
            cur.next=temp;
            temp.prev=cur;
            temp.child=null;
            cur=temp;

        }
        dummy.next.prev=null;
        return dummy.next;
        
    }
}
