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
    int n=0;
    int ans=-1;
    public void helper(TreeNode root)
    {
        if(root==null)
            return;
        if(n<=0)
            return;
        helper(root.left);
        n=n-1;
        if(n==0)
            ans=root.val;
        helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        n=k;
        helper(root);
        return ans;
    }
}