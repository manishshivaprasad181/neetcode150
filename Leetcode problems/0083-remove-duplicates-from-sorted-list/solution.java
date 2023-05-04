/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        
        if(head==null)
        return head;
        if(head.next==null)
        return head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            if(curr.val!=prev.val)
            {
                prev.next=curr;
                prev=curr;
                curr=curr.next;
            }
          else if(prev.val==curr.val && curr.next==null)
            {
                prev.next=null;
                curr=curr.next;
            }
            else
            curr=curr.next;
        }
        return head;
    }
}
