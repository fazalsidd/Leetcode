class Solution {
    // public int helper(int[][] mat,int i,int j,int visited[][],int dp[][])
    // {
    //     if(i<0||j<0||i==mat.length||j==mat[0].length)
    //     return 10000;

    //     if(mat[i][j]==0)
    //     return dp[i][j]=0;

    //     if(visited[i][j]==1)
    //     return 10000;
        
    //     if(dp[i][j]!=-1)
    //     return dp[i][j];
        
    //     visited[i][j]=1;

    //     int left=1+helper(mat,i,j-1,visited,dp);
    //     int right=1+helper(mat,i,j+1,visited,dp);
    //     int up=1+helper(mat,i+1,j,visited,dp);
    //     int down=1+helper(mat,i-1,j,visited,dp);

    //     visited[i][j]=0;
    //      mat[i][j]=Math.min(Math.min(left,right),Math.min(up,down));
    //      return dp[i][j]=Math.min(Math.min(left,right),Math.min(up,down))
    // }
    public int[][] updateMatrix(int[][] mat) {
        int visited[][]=new int[mat.length][mat[0].length];
        int dist[][]=new int[mat.length][mat[0].length];
        Queue<Pair<Integer, Integer>> q = new LinkedList();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j));
                    visited[i][j]=1;
                }
            }
        }
        int terr[]={-1,0,+1,0};
        int terc[]={0,+1,0,-1};
        while(!q.isEmpty())
        {
            Pair<Integer, Integer> p = q.poll();
            for(int i=0;i<4;i++)
            {
                int row=p.getKey()+terr[i];
                int col=p.getValue()+terc[i];
                {
                    if(row>=0&&col>=0&&row<mat.length&&col<mat[0].length&&visited[row][col]==0)
                    {
                        visited[row][col]=1;
                        q.add(new Pair(row,col));
                        dist[row][col]=dist[p.getKey()][p.getValue()]+1;
                    }
                }
            }
        }
        return dist;
    }
}