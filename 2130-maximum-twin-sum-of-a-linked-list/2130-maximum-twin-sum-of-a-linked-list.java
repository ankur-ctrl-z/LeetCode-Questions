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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  
        }

        ListNode prev = null, curr = slow;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        int max = 0;
        ListNode left = head, right = prev;
        while (right != null) { 
            int sum = left.val + right.val;
            max = Math.max(max, sum);

            left = left.next;
            right = right.next;
        }

        return max;
    }
}

// class Solution {
//     public int pairSum(ListNode head) {
//         int sum = 0, max = 0;
//         ArrayList<Integer> ll = new ArrayList<>();
//        if(head == null || head.next == null){
//         return head.val;
//        } 
//        ListNode temp = head;
//        while(temp != null){
//            ll.add(temp.val);
//            temp = temp.next;
//        }
//        int i = 0;
//        int j = ll.size()-1;
//        while(i < j){
//         sum = ll.get(i) + ll.get(j);
//         max = Math.max(sum,max);

//         i++;
//         j--;
//        }
//        return max;
//     }
// }