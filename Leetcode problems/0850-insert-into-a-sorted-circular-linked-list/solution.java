/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if(head==null)
        {
            Node new_head=new Node(insertVal);
            new_head.next=new_head;
            return new_head;
        }
        Node curr=head;
        while(curr.next!=head)
        {
            if(curr.val<=insertVal && curr.next.val>=insertVal)
            {
                Node new_node=new Node(insertVal,curr.next);
                curr.next=new_node;
                return head;
            }
            else if(curr.val>curr.next.val)
            {
                if(insertVal>=curr.val || insertVal<=curr.next.val)
                {
                    Node new_node=new Node(insertVal,curr.next);
                    curr.next=new_node;
                    return head;
                }
            }
            curr=curr.next;
        }
        Node new_node=new Node(insertVal,curr.next);
        curr.next=new_node;
        return head;
    }
}
