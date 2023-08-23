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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode ans=null;
        if(l1.val<l2.val)
        {
            ans=l1;
            l1=l1.next;
        }
        else
        {
            ans=l2;
            l2=l2.next;
        }
        ListNode tra=ans;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val)
        {
            tra.next=l1;
                tra=tra.next;
            l1=l1.next;
        }
        else
        {
            tra.next=l2;
            tra=tra.next;
            l2=l2.next;
        }
        }
        while(l1!=null)
        {
            tra.next=l1;
                tra=tra.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            tra.next=l2;
            tra=tra.next;
            l2=l2.next;
        }
        tra.next=null;
        return ans;
    }
}