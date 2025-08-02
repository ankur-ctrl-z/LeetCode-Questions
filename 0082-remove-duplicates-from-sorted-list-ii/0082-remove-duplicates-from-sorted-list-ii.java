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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0, head); 
        ListNode slow = dummy;
        ListNode fast = head;

        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }

            if (slow.next != fast) {
                slow.next = fast.next;
            } else {
                slow = slow.next;
            }

            fast = fast.next;
        }

        return dummy.next;
    }
}
