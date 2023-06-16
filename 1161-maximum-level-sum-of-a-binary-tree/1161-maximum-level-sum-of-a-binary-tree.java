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
    int arr[]=new int[1000];
    public void helper(TreeNode root,int dep)
    {
        if(root==null)
            return;
        arr[dep]+=root.val;
       // System.out.print(arr[dep]+" ");
        helper(root.left,dep+1);
        helper(root.right,dep+1);
    }
     public int depth(TreeNode root)
    {
        if(root==null)
            return 0;
        int p=1+depth(root.left);
        int q=1+depth(root.right);
        
        return Math.max(p,q);
    }
    public int maxLevelSum(TreeNode root) {
        int mdep=depth(root);
        Arrays.fill(arr,0);
        helper(root,0);
        int max=Integer.MIN_VALUE;
        int level=0;
        for(int i=0;i<mdep;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                level=i+1;
            }
        }
        return level;
    }
}