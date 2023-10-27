/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int count1=0;
        int count2=0;
        while(a!=null)
        {
            count1++;
            a=a.next;
        }
        while(b!=null)
        {
            count2++;
            b=b.next;
        }
        a=headA;
        b=headB;
        if(count1>count2)
        {
            int steps=count1-count2;
            for(int i=0;i<steps;i++)
            {
                a=a.next;
            }
        }
        else
        {
             int steps=count2-count1;
             for(int i=0;i<steps;i++)
            {
                b=b.next;
            }

        }
        while(a!=b)
        {
            a=a.next;
            b=b.next;
        }
        return a;
    }
}
