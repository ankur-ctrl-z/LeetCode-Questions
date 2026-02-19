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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode temp = dummy; 
        while (temp != null) {
            int sum = 0;
            ListNode temp2 = temp.next;
            
            while (temp2 != null) {
                sum += temp2.val; 
                if (sum == 0) {
                    temp.next = temp2.next;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}