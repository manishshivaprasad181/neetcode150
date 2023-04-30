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
       /*List<Integer> a=new ArrayList<>();
       ListNode curr=head;
       while(curr!=null)
       {
           a.add(curr.val);
           curr=curr.next;
       } 
       int left=0;
       int right=a.size()-1;
       while(left<right)
       {
           if(!a.get(left).equals(a.get(right)))
            return false;
           right--;
           left++;
       }
       return true;*/
       if(head==null)return true;
       ListNode firsthalf=endoffirsthalf(head);
       ListNode secondhalf=reverse(firsthalf.next);
       
       ListNode p1=head;
       ListNode p2=secondhalf;
       while(p2!=null){
       if(p1.val!=p2.val)
       return false;
       p1=p1.next;
       p2=p2.next;
       }
       firsthalf=reverse(secondhalf);
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
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        return prev;
    }
    public ListNode endoffirsthalf(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&& fast.next.next!=null) 
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
