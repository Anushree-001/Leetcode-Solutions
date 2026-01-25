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
    public ListNode reverseList(ListNode head) {

        ListNode previous = null;      // will become new head
        ListNode current = head;       // start from head

        while (current != null) {
            ListNode nextNode = current.next; // store next
            current.next = previous;          // reverse link
            previous = current;               // move previous
            current = nextNode;               // move current
        }

        return previous; // new head
    }
}
