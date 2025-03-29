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
        ListNode prev = null;  // Initially, there's no previous node
    ListNode curr = head;  // Start from the head of the list
    
    while (curr != null) {  // Traverse the list
      ListNode next = curr.next; // Store next node before breaking the link
      curr.next = prev;          // Reverse the pointer (make curr point to prev)
      prev = curr;               // Move prev forward to curr
      curr = next;               // Move curr forward to next
    }

    return prev; // New head of the reversed list
    }
}