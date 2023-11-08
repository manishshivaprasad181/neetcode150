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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int length=1;
        ListNode tail=head;
        while(tail.next!=null)
        {
            length++;
            tail=tail.next;
        }
        k=k%length;
        if(k==0)
            return head;
        ListNode curr=head;
        for(int i=0;i<length-k-1;i++)
        {
            curr=curr.next;
        }
        ListNode newhead=curr.next;
        curr.next=null;
        tail.next=head;
        return newhead;
    }
}
