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
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // remove head
        if (n == length) {
            return head.next;
        }

        int target = length - n;
        temp = head;

        for (int i = 1; i < target; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}
