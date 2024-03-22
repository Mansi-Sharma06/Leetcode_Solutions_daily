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
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head; 
        while (temp != null) { 
            list.add(temp.val); 
            temp = temp.next; 
        }

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) != list.get(list.size() -1 - i)){
                return false;
            }
        }
        return true;
    }
}