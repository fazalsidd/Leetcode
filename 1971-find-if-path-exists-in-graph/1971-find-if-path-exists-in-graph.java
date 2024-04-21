class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int visited[]=new int[n];
        Queue<Integer> q= new LinkedList<>();
        q.add(source);
        visited[source]=1;
        while(!q.isEmpty())
        {
                int cur=q.remove();
                if(cur==destination)
                {
                    return true;
                }
            for(int i=0;i<edges.length;i++)
            {
                if(edges[i][0]==cur&&visited[edges[i][1]]!=1)
                {
                    q.add(edges[i][1]);
                    visited[edges[i][1]]=1;
                }
                else if(edges[i][1]==cur&&visited[edges[i][0]]!=1)
                {
                     q.add(edges[i][0]);
                    visited[edges[i][0]]=1;
                }
            }
        }
        return false;
    }
}