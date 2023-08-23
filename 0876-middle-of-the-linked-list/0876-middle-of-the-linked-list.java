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
    public ListNode middleNode(ListNode head) {
        ListNode ans=head;
        while(head!=null)
        {
            if(head.next==null)
                break;
            ans=ans.next;
            head=head.next.next;
        }
        return ans;
    }
}