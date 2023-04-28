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
    public boolean check(TreeNode root, TreeNode sub)
    {
        if(root==null&&sub==null)
            return true;
        if(root==null&&sub!=null)
            return false;
        if(sub==null&&root!=null)
            return false;
            if(sub.val!=root.val)
                return false;
        
        return check(root.right,sub.right)&&check(root.left,sub.left);
    }
    public boolean helper(TreeNode root, TreeNode sub)
    {
        if(root==null)
            return false;
        
        if(check(root,sub))
            return true;
        
        return helper(root.right,sub)||helper(root.left,sub);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot==null)
            return true;
        return helper(root,subRoot);
    }
}