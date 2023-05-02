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
    public void reorderList(ListNode head) {
        Stack<ListNode> s = new Stack<ListNode>();
        Queue<ListNode> q= new LinkedList<>();
        ListNode h=head;
        int n=0;
        while(h!=null)
        {
            q.add(h);
            s.push(h);
            n++;
            h=h.next;
        }
        ListNode curr=head;
        for(int i=1;i<n;i++)
        {
            if(i%2==1)
            {
                ListNode t=q.remove();
                t.next=s.peek();
                curr=s.peek();
            }
            else
            {
                ListNode te=s.pop();
                te.next=q.peek();
                curr=q.peek();
            }
        }
        curr.next=null;
    }
}