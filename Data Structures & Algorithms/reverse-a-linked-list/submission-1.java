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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr.next != null) {
            // Store the next node reference
            ListNode next = curr.next;
            // Make the next point to prev node
            curr.next = prev;

            // Move ptr
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        return curr;
    }
}