/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode intersection(ListNode head)
    {
        if(head==null || head.next==null)
        return null;
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast)
        {
            if(fast==null || fast.next==null)
            return null;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode intersection=intersection(head);
        if(intersection==null)
        return null;
        ListNode fast=head;
        while(fast!=intersection)
        {
            fast=fast.next;
            intersection=intersection.next;
        }
        return intersection;
    }
}
