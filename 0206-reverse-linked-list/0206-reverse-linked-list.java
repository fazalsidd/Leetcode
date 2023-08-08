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
        if(head==null)
            return null;
        ListNode f=head;
        ListNode s=head.next;
        ListNode temp=head.next;
        f.next=null;
        while(temp!=null)
        {
            temp=s.next;
            s.next=f;
            f=s;
            s=temp;
        }
        return f;
    }
}