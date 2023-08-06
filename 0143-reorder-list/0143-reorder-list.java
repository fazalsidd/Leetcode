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
    public ListNode helper(int l,int r,List<ListNode>list)
    {
        if(l==r)
        {
            list.get(l).next=null;
            return list.get(l);
        }
        if(l>r)
            return null;
        
        list.get(l).next=list.get(r);
        list.get(r).next=helper(l+1,r-1,list);
        return list.get(l);
    }
    public void reorderList(ListNode h) {
        List<ListNode>list=new ArrayList<>();
        ListNode head=h;
        while(head!=null)
        {
            list.add(head);
            head=head.next;
        }
        helper(0,list.size()-1,list);
    }
}