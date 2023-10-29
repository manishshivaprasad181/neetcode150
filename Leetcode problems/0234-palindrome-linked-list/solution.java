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
        ListNode firsthalfend=endoffirsthalf(head);
        ListNode secondhalfstart=reversesecondhalf(firsthalfend);
        ListNode p2=secondhalfstart;
        ListNode p1=head;
        while(p2!=null)
        {
            if(p2.val!=p1.val)
            return false;
            else
            {
                p2=p2.next;
                p1=p1.next;
            }
        }
        return true;
    }
    public ListNode reversesecondhalf(ListNode head)
    {
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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
