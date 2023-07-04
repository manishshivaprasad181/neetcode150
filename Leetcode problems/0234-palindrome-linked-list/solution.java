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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null)
        return true;
        ListNode firsthalf;
        ListNode secondhalf;
        firsthalf=endoffirsthalf(head);
        secondhalf=reverse(firsthalf.next);
        ListNode p1=head;
        ListNode p2=secondhalf;
        while(p2!=null)
        {
            if(p1.val!=p2.val)
            return false;
            p1=p1.next;
            p2=p2.next;
        }
       
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null)
        return null;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
    public ListNode endoffirsthalf(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
