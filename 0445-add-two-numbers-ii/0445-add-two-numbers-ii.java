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
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        // Push all digits of l1
        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }

        // Push all digits of l2
        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int carry = 0;

        // Add from stacks
        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!st1.isEmpty()) sum += st1.pop();
            if (!st2.isEmpty()) sum += st2.pop();

            carry = sum / 10;
            int digit = sum % 10;

            // Insert at head
            ListNode newNode = new ListNode(digit);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }
}
