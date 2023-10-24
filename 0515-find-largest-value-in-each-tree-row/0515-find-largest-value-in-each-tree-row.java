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
    public List<Integer> largestValues(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        q.add(new Pair(root,0));
        int index=0;
        ans.add(root.val);
        while(!q.isEmpty())
        {
            Pair<TreeNode,Integer> p=q.poll();
            int idx=p.getValue();
            TreeNode r=p.getKey();
            if(idx>index)
            {
                ans.add(r.val);
                index++;
            }
            else
            {
                ans.set(index,Math.max(ans.get(index),r.val));
            }
            if(r.left!=null)
            q.add(new Pair(r.left,idx+1));
            if(r.right!=null)
             q.add(new Pair(r.right,idx+1));
        }
        
        return ans;
    }
}