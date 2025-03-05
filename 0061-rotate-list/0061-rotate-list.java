class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge case: if list is empty or has only one node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Get the size of the linked list
        int size = getSize(head);

        // Optimize k to avoid unnecessary full rotations
        k = k % size;
        if (k == 0) {
            return head; // No rotation needed if k is a multiple of size
        }

        // Find the new tail at position (size - k - 1) to break the list
        ListNode temp = head;
        for (int i = 0; i < (size - k) - 1; i++) { // Fix: Traverse properly to find new tail
            temp = temp.next;
        }

        // Set new head as the node after new tail
        ListNode newHead = temp.next;
        temp.next = null; // Fix: Break the link to make it a separate list

        // Find the last node of new head's sublist
        ListNode lastNode = newHead;
        while (lastNode.next != null) { // Fix: Properly traverse to the last node
            lastNode = lastNode.next;
        }

        // Connect last node of the rotated sublist to the old head
        lastNode.next = head; // Fix: Correctly link last node to original head

        return newHead; // Return the new head after rotation
    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}
