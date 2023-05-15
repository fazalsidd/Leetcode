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
    public ListNode swapNodes(ListNode head, int k) {
        Queue<ListNode> q= new LinkedList<>();
        ListNode beg=null;
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                beg=temp;
            }
            if(q.size()<k)
            {
                q.add(temp);
            }
            else
            {
                q.remove();
                q.add(temp);
            }
            temp=temp.next;
        }
        ListNode end=q.remove();
        int temp2=beg.val;
        beg.val=end.val;
        end.val=temp2;
        return head;
    }
}