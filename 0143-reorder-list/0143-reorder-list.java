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
       ArrayList<Integer> ll = new ArrayList<>();
       ListNode temp = head;
       while(temp != null) {
         ll.add(temp.val);
         temp = temp.next;
       } 
       int i = 0;
       int j = ll.size()-1;
       ListNode temp2 = head;
       while(temp2 != null && i <= j){
         temp2.val = ll.get(i);
         temp2 = temp2.next;
         if(temp2 != null){
         temp2.val = ll.get(j);
         temp2 = temp2.next;
         }
         i++;
         j--;
       }
    //    if(i == j && temp2 != null) {
    //     temp2.val = ll.get(i);
    //    }
    }
}