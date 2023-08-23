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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
            return null;
        int k=0;
        ListNode temp=head;
        while(temp!=null)
        {
            k++;
            temp=temp.next;
        }
        if(n==k)
            return head.next;
        ListNode first=head;
        ListNode second=head.next.next;
        int i=1;
        while(i<(k-n))
        {
            i++;
            first=first.next;
            second=second.next;
        }
        first.next=second;
        return head;
    }
}