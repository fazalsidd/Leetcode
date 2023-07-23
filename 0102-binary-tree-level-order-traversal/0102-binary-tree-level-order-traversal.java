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
    public List<List<Integer>> levelOrder(TreeNode root) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
       List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair<TreeNode, Integer> p = q.poll();
            TreeNode node=p.getKey();
            int n=p.getValue();
            if(map.containsKey(n))
            {
                List<Integer> temp=map.get(n);
                temp.add(node.val);
                map.put(n,temp);
            }
            else
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(node.val);
                map.put(n,list);
            }
            if(node.left!=null)
            q.add(new Pair(node.left,n+1));
            if(node.right!=null)
            q.add(new Pair(node.right,n+1));
        }
        for (Map.Entry<Integer,List<Integer>> l : map.entrySet())
            ans.add(l.getValue());
        
        return ans;
    }
}