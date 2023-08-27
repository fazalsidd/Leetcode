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
        ListNode first=null;
        ListNode second=head;
        while(second!=null)
        {
            ListNode temp=second;
            second=second.next;
            temp.next=first;
            first=temp;
        }
        return first;
    }
}