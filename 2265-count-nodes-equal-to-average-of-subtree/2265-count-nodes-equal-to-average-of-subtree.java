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
    int ans=0;
    public int[] helper(TreeNode root)
    {
         int arr[]=new int[2];
        if(root==null)
        {
            arr[0]=0;
            arr[1]=0;
            return arr;
        }
        int p[]=new int[2];
        int q[]=new int[2];
        p=helper(root.left);
        q=helper(root.right);
        if(Math.floor((p[0]+q[0]+root.val)/(p[1]+q[1]+1))==root.val)
        {
            ans=ans+1;
        }
        arr[0]=p[0]+q[0]+root.val;
        arr[1]=p[1]+q[1]+1;
        return arr;
    }
    public int averageOfSubtree(TreeNode root) {
        //int arr[]=new int[2];
        int ig[]=new int[2];
        ig=helper(root);
        return ans;
    }
}