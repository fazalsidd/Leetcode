/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode temp=head;
        while(head!=null)
        {
            if(temp.next!=null)
            {
                if(temp.next.next!=null)
                {
                    temp=temp.next.next;
                    head=head.next;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
            if(head==temp)
                return true;
        }
        return false;
    }
}