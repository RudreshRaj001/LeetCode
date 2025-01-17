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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode ptr = head;
        while(ptr.next != null){
            int temp = ptr.val;
            ptr.val = ptr.next.val;
            ptr.next.val = temp;
            if(ptr.next.next != null){
                ptr = ptr.next.next;
            }else{
                break;
            }
        }
        return head;
    }
}