class Solution {
    public int shortestPathBinaryMatrix(int[][] grid){ 
        if(grid[0][0]==1)
        return -1;
    Queue<Pair<Pair<Integer,Integer>,Integer>> q=new LinkedList<>();
    int visited[][]=new int[grid.length][grid[0].length];
    q.add(new Pair(new Pair(0,0),1));
    visited[0][0]=1;
     int r[]={-1,1,0,0};
     int c[]={0,0,-1,1};
     int dr[]={-1,1,1,-1};
     int dc[]={1,1,-1,-1};
     int ans=Integer.MAX_VALUE;
     while(!q.isEmpty())
     {
         Pair<Pair<Integer,Integer>,Integer> p=q.poll();
         int w=p.getValue();
         Pair<Integer,Integer> p2=p.getKey();
         int a=p2.getKey();
         int b=p2.getValue();
          if(a==grid.length-1&&b==grid.length-1)
          ans=Math.min(ans,w);
         for(int k=0;k<4;k++)
         {
            int i=a+r[k];
            int j=b+c[k];
            if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length)
            {
                if(grid[i][j]==0&&visited[i][j]==0)
                {
                  q.add(new Pair(new Pair(i,j),w+1));
                  visited[i][j]=1;
                }
            }
         }
         for(int k=0;k<4;k++)
         {
            int i=a+dr[k];
            int j=b+dc[k];
            if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length)
            {
                if(grid[i][j]==0&&visited[i][j]==0)
                {
                  q.add(new Pair(new Pair(i,j),w+1));
                  visited[i][j]=1;
                }
            }
         }
     }
     if(ans==Integer.MAX_VALUE)
     return -1;

     return ans;
    }
}