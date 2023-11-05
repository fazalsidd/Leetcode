class Solution {
    // public int helper(int n,ArrayList<ArrayList<Integer>> adj,int i,int visited[],int vis[])
    // {
    //     if(visited[i]==1)
    //         return 0;
    //     vis[i]=1;
    //     int ans=0;
    //     for(int j=0;j<adj.get(i).size();j++)
    //     {
    //         if(visited[adj.get(i).get(j)]==0)
    //         {
    //             visited[adj.get(i).get(j)]=1;
    //            ans+=(1+helper(n,adj,adj.get(i).get(j),visited,vis));
    //             visited[i]=0;
    //         }
    //     }
    //     return ans;
    // }
    public int findChampion(int n, int[][] edges) {
       int digree[]=new int[n];
		for(int i=0;i<edges.length;i++)
		{
			digree[edges[i][1]]++;
		}
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(digree[i]==0)
            {
                if(ans!=-1)
                    return -1;
                ans=i;
            }
        }
        return ans;
    }
}