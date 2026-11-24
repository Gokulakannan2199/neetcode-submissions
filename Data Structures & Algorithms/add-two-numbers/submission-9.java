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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int rem = sum > 9 ? 1 : 0;
        ListNode res = new ListNode((sum % 10), null);
        ListNode temp = res;
        
        while(l1.next != null && l2.next != null) {
            l1 = l1.next; l2 = l2.next;
            sum = l1.val + l2.val + rem;
            rem = sum > 9 ? 1 : 0;
            temp.next = new ListNode(sum % 10, null);
            temp = temp.next;        
        }

       
        if(l1.next != null || l2.next != null)
            l1 = l1.next != null ? l1 : l2;

        while(l1.next != null) {
            l1 = l1.next;
            sum = l1.val + rem;
            rem = sum > 9 ? 1 : 0;
            temp.next = new ListNode(sum % 10, null);
            temp = temp.next;      
        }  

        temp.next = rem == 1 ? new ListNode(rem, null) : null;

        return res;
    }
}
