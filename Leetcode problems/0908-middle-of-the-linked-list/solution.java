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
    public ListNode middleNode(ListNode head) {
        ListNode[] A=new ListNode[100];
        int i=0;
        while(head!=null)
        {
            A[i]=head;
            i++;
            head=head.next;

        }
        return A[i/2];
    }
}
