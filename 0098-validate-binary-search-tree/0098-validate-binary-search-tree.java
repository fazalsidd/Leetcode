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
    boolean ans=true;
    public void helper(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i-1)>=list.get(i))
                return false;
        }
        return true;
    }
}