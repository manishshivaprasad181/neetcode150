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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead=new ListNode(-1);
        ListNode sentinel=prehead;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null)
        {
            if(p1.val<p2.val)
            {
                sentinel.next=p1;
                p1=p1.next;
            }
            else
            {
                sentinel.next=p2;
                p2=p2.next;
            }
            sentinel=sentinel.next;
        }
        sentinel.next=p1==null?p2:p1;
        return prehead.next;
        
    }
}
