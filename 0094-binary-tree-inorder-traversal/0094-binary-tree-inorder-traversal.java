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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode>q=new Stack<>();
        List<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            if(q.peek()!=null)
            {
                q.push(q.peek().left);
                continue;
            }
            else
            {
                
                q.pop();
                if(q.isEmpty())
                    return ans;
                TreeNode temp=q.pop();
                q.push(temp.right);
                ans.add(temp.val);
            }
        }
        return ans;
    }
}