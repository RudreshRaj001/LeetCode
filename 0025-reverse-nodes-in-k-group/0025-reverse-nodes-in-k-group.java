 /**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        while (true) {
            // for (int i = 0; current != null && i < left - 1; i++) {
            //     prev = current;
            //     current = current.next;
            // }

            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            ListNode check = current;
            for (int i = 0; check != null && i < k - 1; i++) {
                check = check.next;
            }
            if(check == null) break;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
            if(current == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
}