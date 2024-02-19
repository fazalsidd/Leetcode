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
    public int helper(TreeNode root,int max)
    {
        if(root==null)
            return 0;
        int count=0;
        if(root.val>=max)
            count=1+helper(root.left,root.val)+helper(root.right,root.val);
        else
            count=helper(root.left,max)+helper(root.right,max);
        
        return count;
    }
    public int goodNodes(TreeNode root) {
        int max=root.val;
        return helper(root,max);
    }
}