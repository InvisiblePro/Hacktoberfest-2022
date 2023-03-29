// Java solution to Remove Nth Node From End of List problem from LeetCode
// Reference: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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

public class RemoveNthNodeFromEndOfList {
	// Time: O(N)		Space: O(1)
	public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        for (ListNode temp = head; temp != null; temp = temp.next)
            count++;
        if (count == 1) return null;
        if (count - n == 0) return head.next;
        
        ListNode temp = head;
        for (int i = 1; i + 1 <= count - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
