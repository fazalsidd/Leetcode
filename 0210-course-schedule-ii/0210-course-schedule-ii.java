class Solution {
    ArrayList<Integer> order=new ArrayList<>();
    public boolean helper(int num,ArrayList<ArrayList<Integer>> adj,Boolean dp[],int vis[],int i)
    {
        if(dp[i]!=null)
            return dp[i];
        if(vis[i]==1)
            return true;
        vis[i]=1;
        ArrayList<Integer> list=adj.get(i);
        boolean ans=false;
        for(int j=0;j<list.size();j++)
        {
            ans=ans||helper(num,adj,dp,vis,list.get(j));
        }
        if(!ans)
        order.add(i);
        
        vis[i]=0;
        return dp[i]=ans;
    }
    public int [] findOrder(int num, int[][] pre) {
        Boolean dp[]=new Boolean[num];
        int vis[]=new int[num];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++)
        {
            adj.get(pre[i][0]).add(pre[i][1]);
        }
        for(int i=0;i<num;i++)
        {
            if(helper(num,adj,dp,vis,i))
                return new int []{};
        }
        int ans[]=new int[num];
        for(int i=0;i<order.size();i++)
        {
            ans[i]=order.get(i);
        }
        
        return ans;
    }
}