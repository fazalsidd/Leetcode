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
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode list=head;
	    ListNode temp=head;
		int flag=0;
        while(temp!=null)
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
					return null;
                }
            }
            else
            {
				return null;
            }
            if(head==temp)
			{
				break;
			}
        }
       //System.out.print(head.val+" "+temp.val);
			int count=1;
			temp=temp.next;
			while(head!=temp)
			{
				count++;
				temp=temp.next;
			}
			head=list;
			temp=list;
			while(count>1)
			{
				temp=temp.next;
				count--;
			}
			
			while(temp.next!=head)
			{
				head=head.next;
				temp=temp.next;
                //System.out.println(hprev.val+" "+temp.val);
			}
			return head;
    }
}