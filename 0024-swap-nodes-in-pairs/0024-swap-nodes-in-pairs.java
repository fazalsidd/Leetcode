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
    public ListNode helper(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        ListNode temp=head.next;
        head.next=helper(head.next.next);
        temp.next=head;
        return temp;
    }
    public ListNode swapPairs(ListNode head) {
        return helper(head);
    }
}