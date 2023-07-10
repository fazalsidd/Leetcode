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
    public int helper(TreeNode root)
    {
        if(root==null)
            return 10000;
        if(root.left==null&&root.right==null)
            return 1;
        int p=helper(root.left);
        int q=helper(root.right);
        return Math.min(p,q)+1;
    }
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return helper(root);
    }
}