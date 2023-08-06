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
       List<Integer> val = new ArrayList<>();

       ListNode curr = head;
       while(curr!=null) {
           val.add(curr.val);
           curr = curr.next;
       }

       int front =0;
       int back = val.size()-1;
       for(int i=0;i<val.size();i++) {
           if(!val.get(front).equals(val.get(back))) 
                return false;
            front++;
            back--;
       }
        return true;
    }
}
