class Solution {
    List<Integer> ans=new ArrayList<>();
    public boolean helper(int[][] graph,int i,int tell[],int visited[])
    {
        if(graph[i].length==0)
        {
            tell[i]=1;
            if(!ans.contains(i))
            ans.add(i);
        return true;
        }
         if(tell[i]!=-1)
        {
            if(tell[i]==1)
            return true;
            else
            return false;
        }
        if(visited[i]==1)
        {
            tell[i]=0;
        return false;
        }
        visited[i]=1;
        boolean an=true;
        for(int j=0;j<graph[i].length;j++)
        {
            an=an&&helper(graph,graph[i][j],tell,visited);
        }
        visited[i]=0;
        if(an&&!ans.contains(i))
        ans.add(i);
         if(an)
         tell[i]=1;
         else
         tell[i]=0;

        return an;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int tell[]=new int[graph.length];
        Arrays.fill(tell,-1);
        int visited[]=new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(tell[i]==-1)
            {
            helper(graph,i,tell,visited);
            }
        }
        Collections.sort(ans); 
        return ans;
    }
}