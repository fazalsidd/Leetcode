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
    int ans=Integer.MIN_VALUE;
    public int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=helper(root.left);
        int r=helper(root.right);
        ans=Math.max(ans,Math.max(root.val+l,Math.max(root.val+r,Math.max(root.val+l+r,root.val))));
        return Math.max(root.val+r,Math.max(root.val+l,root.val));
        
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
}