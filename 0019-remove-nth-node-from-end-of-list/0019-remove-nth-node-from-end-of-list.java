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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        if(head.next==null)
            return null;
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            n+=1;
            temp=temp.next;
        }
        if(n==k)
            return head.next;
        temp=head;
        while(n!=k)
        {
            n-=1;
            if(n==k)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}