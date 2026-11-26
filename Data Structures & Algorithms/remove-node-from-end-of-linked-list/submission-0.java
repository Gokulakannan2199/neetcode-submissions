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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return head.next;
        
        ListNode prev = null;
        ListNode curr = head;
        int nodes = 0, ptr = 0;

        while(curr != null) {
            nodes++;
            curr = curr.next;
        }

        curr = head;

        while(curr != null) {
            ptr++;
            if(nodes - ptr + 1 == n) {
                if(prev == null) head = head.next;
                else prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;

    }
}
