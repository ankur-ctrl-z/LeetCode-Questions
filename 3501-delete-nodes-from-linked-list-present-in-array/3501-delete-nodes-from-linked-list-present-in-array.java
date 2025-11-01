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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> toDelete = new HashSet<>();
        for (int val : nums) toDelete.add(val);
        while (head != null && toDelete.contains(head.val)) {
            head = head.next;
        }

    ListNode curr = head;
    while (curr != null && curr.next != null) {
        if (toDelete.contains(curr.next.val)) {
            curr.next = curr.next.next;
        } else {
            curr = curr.next;
        }
        }
        return head;
    }
}