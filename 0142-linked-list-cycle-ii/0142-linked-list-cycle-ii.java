/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == tortoise){
                // int ans = 0;
                ListNode start = head;
                while(hare != start){
                    hare = hare.next;
                    start = start.next;
                }
                return start;
            }
        }

        

        return null;
    }
}