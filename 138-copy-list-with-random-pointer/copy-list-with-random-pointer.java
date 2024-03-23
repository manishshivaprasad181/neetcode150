/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> oldtoCopy= new HashMap<>();
        oldtoCopy.put(null,null);
        Node curr=head;
        while(curr!=null)
        {
            Node copy=new Node(curr.val);
            oldtoCopy.put(curr,copy);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null)
        {
            Node copy=oldtoCopy.get(curr);
            copy.next=oldtoCopy.get(curr.next);
            copy.random=oldtoCopy.get(curr.random);
            curr=curr.next;
        }
        return oldtoCopy.get(head);

        
    }
}