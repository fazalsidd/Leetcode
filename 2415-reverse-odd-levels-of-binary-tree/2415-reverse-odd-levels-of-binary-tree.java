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
    public TreeNode reverseOddLevels(TreeNode root) {
         Stack<Integer> s = new Stack<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList();
        
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair<TreeNode, Integer> p = q.poll();
            TreeNode t=p.getKey();
            int c=p.getValue();
            if(c==1)
            {
                if(t.left!=null)
                 q.add(new Pair(t.left,0));
                if(t.right!=null)
                q.add(new Pair(t.right,0));
                 t.val=s.pop();
                
            }
            else
            {
                if(t.left!=null)
                 q.add(new Pair(t.left,1));
                if(t.right!=null)
                q.add(new Pair(t.right,1));
                if(t.left!=null)
                s.push(t.left.val);
                if(t.right!=null)
                s.push(t.right.val);
            }
        }
        return root;
    }
}