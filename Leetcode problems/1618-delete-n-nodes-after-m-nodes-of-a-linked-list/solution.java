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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currentnode=head;
        ListNode lastMnode=head;
        while(currentnode!=null){
            int mcount=m,ncount=n;
            while(currentnode!=null && mcount!=0)
            {
                lastMnode=currentnode;
                currentnode=currentnode.next;
                mcount--;
            }
            while(currentnode!=null && ncount!=0){
                currentnode=currentnode.next;
                ncount--;
            }
            lastMnode.next=currentnode;
        }
        return head;
    }
}
