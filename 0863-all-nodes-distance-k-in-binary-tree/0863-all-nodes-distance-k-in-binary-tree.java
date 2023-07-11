/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> ans=new ArrayList<>();
    public int helper(TreeNode root, TreeNode t, int k)
    {
        if(root==null)
        {
            return 10000;
        }
        if(root.val==t.val)
        {
            below(root,k);
            return 1;
        }
        int p=helper(root.right,t,k);
        int q=helper(root.left,t,k);
        if(k-Math.min(p,q)>=1)
        {
            if(p<q)
                below(root.left,k-p-1);
            else
                below(root.right,k-q-1);
        }
        else if(k-Math.min(p,q)==0)
        {
            ans.add(root.val);
        }
        return Math.min(p,q)+1;
    }
    public void below(TreeNode root,int k)
    {
        if(root==null)
            return;
        if(k==0)
        {
            ans.add(root.val);
            return;
        }
        below(root.left,k-1);
        below(root.right,k-1);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        helper(root,target,k);
        return ans;
    }
}