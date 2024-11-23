class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null; // Initially, no previous node
        ListNode current = head; // Start with the head

        while (current != null) {
            ListNode next = current.next; // Save the next node
            current.next = previous;     // Reverse the current node's pointer
            previous = current;          // Move previous to current
            current = next;              // Move to the next node
        }

        return previous; // New head of the reversed list
    }
}