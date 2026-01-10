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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        ListNode prev = null;

        while (mid != null) {
            ListNode ahead = mid.next;
            mid.next = prev;
            prev = mid;
            mid = ahead;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode nextFirst = first.next;
            first.next = second;
            first = second;
            second = nextFirst;
        }

    }
}
