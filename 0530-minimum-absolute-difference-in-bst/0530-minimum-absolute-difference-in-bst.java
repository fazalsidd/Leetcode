/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=Integer.MAX_VALUE;
    public int [] helper(TreeNode root)
    {
        int arr[]=new int[2];
        arr[0]=Integer.MAX_VALUE;
        arr[1]=Integer.MIN_VALUE;
        if(root==null)
        return arr;

         int left[]=new int[2];
         int right[]=new int[2];
        left=helper(root.left);
        right=helper(root.right);
        if(left[1]!=Integer.MIN_VALUE)
        {
        ans=Math.min(ans,root.val-left[1]);
        }
        if(right[0]!=Integer.MAX_VALUE)
        {
        ans=Math.min(ans,Math.abs(root.val-right[0]));
        }
          arr[0]=Math.min(root.val,left[0]);
          arr[1]=Math.max(root.val,right[1]);
        return arr;
    }
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return ans;
    }
}