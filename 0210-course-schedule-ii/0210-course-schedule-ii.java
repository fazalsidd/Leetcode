class Solution {
    public boolean dfs(int i,List<List<Integer>> adj,boolean vis[],boolean path[],Stack<Integer> st)
    {
        vis[i]=true;
        path[i]=true;
        for(int x:adj.get(i))
        {
            if(!vis[x])
            {
                if(dfs(x,adj,vis,path,st))
                    return true;
            }  
            else if(path[x])
                return true;
        }
        path[i]=false;
        st.push(i);
        return false;
    }
    public int[] findOrder(int n, int[][] pre) {
        List<List<Integer>> adj=new ArrayList<>();
        boolean vis[]=new boolean[n];
        boolean path[]=new boolean[n];
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++)
        {
            adj.get(pre[i][1]).add(pre[i][0]);
        }
        
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                if(dfs(i,adj,vis,path,st))
                    return new int[0];
            }
        }
        int i=0;
        while(!st.isEmpty())
        {
            ans[i++]=st.pop();
        }
        return ans;
    }
}