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
    public int pairSum(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int ans=Integer.MIN_VALUE;
        while(head!=null)
        {
            if(map.containsKey(n-i-1))
            {
                ans=Math.max(ans,head.val+map.get(n-i-1));
            }
            else
            {
                map.put(i,head.val);
            }
            head=head.next;
            i++;
        }
        return ans;
    }
}