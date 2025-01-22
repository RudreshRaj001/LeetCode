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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        while(head != null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }
        ListNode n = head;
        while(n != null && n.next != null){
            if(n.next.val == val){
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
        return head;
    }
}