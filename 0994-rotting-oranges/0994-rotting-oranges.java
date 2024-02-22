class Solution {
    public int orangesRotting(int[][] grid) {
        int vis[][]=new int[grid.length][grid[0].length];
        Queue<Pair<Pair<Integer,Integer>,Integer>> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(new Pair(i,j),0));
                    vis[i][j]=1;
                }
            }
        }
        int hor[]={-1,1,0,0};
        int ver[]={0,0,-1,1};
        int ans=0;
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> p=q.peek().getKey();
            int time=q.peek().getValue();
            int ii=p.getKey();
            int jj=p.getValue();
            ans=Math.max(ans,time);
            q.poll();
            for(int i=0;i<4;i++)
            {
                int row=ii+hor[i];
                int col=jj+ver[i];
                if(row>=0&&row<grid.length&&col>=0&&col<grid[0].length)
                {
                    if(vis[row][col]==0 && grid[row][col]==1)
                    {
                        vis[row][col]=1;
                        q.add(new Pair(new Pair(row,col),time+1));
                    }
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1&&vis[i][j]==0)
                {
                    return -1;
                }
            }
        }
        return ans;
    }
}