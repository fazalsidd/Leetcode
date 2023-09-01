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
    public void helper(TreeNode root,HashMap<Integer,Integer> map,List<Integer> ans,int d)
        {
        if(root==null)
            return;
        if(!map.containsKey(d))
        {
            ans.add(root.val);
            map.put(d,d);
        }
        helper(root.right,map,ans,d+1);
        helper(root.left,map,ans,d+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        helper(root,map,ans,0);
        return ans;
    }
}