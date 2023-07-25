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
    int k=0;
    public TreeNode helper(int[] pr, int[] in,int l,int r)
    {
        if(l>r)
        {
            return null;
        }
        TreeNode temp=new TreeNode(pr[k]);
        k++;
        int flag=0;
        int j=l;
            for(j=l;j<=r;j++)
            {
                if(in[j]==temp.val)
                {
                    break;
                }
            }
                    temp.left=helper(pr,in,l,j-1);
                    temp.right=helper(pr,in,j+1,r);
        return temp;
    }
    public TreeNode buildTree(int[] pr, int[] in) {
        return helper(pr,in,0,pr.length-1);
    }
}