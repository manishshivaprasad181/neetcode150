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
    public ListNode reverselinkedlist(ListNode head, int k)
    {
        ListNode new_head=null;
        ListNode ptr=head;
        while(k>0){
            ListNode next_node=ptr.next;
            ptr.next=new_head;
            new_head=ptr;
            ptr=next_node;
            k--;
        }
        return new_head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode ptr = head;
       ListNode ktail=null;
       ListNode new_head=null;
       while(ptr!=null)
       {
        int count=0;
        ptr=head;
        while(count<k && ptr!=null)
        {
            ptr=ptr.next;
            count+=1;
        }
        if(count==k)
        {
            ListNode revhead=reverselinkedlist(head,k);
            if(new_head==null)
            new_head=revhead;
            if(ktail!=null)
            ktail.next=revhead;
            ktail=head;
            head=ptr;
    
            
        }
       }
       if(ktail!=null)
       ktail.next=head;
       return new_head==null?head:new_head;

    }
}
