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
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int maxSoFar = head.val;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;

        while (curr != null) {
            if (curr.val >= maxSoFar) {
                maxSoFar = curr.val;
                prev = curr;
            } else {
                prev.next = curr.next; 
            }
            curr = curr.next;
        }

        return reverseList(dummy.next);
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}