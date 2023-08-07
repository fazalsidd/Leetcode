class Solution {
    public void helper(char[][] g,int i,int j)
    {
        if(i<0||j<0||i>=g.length||j>=g[0].length)
            return;
        if(g[i][j]=='2')
            return;
        if(g[i][j]=='0')
            return;
        g[i][j]='2';
        helper(g,i+1,j);
        helper(g,i,j+1);
        helper(g,i-1,j);
        helper(g,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    ans++;
                    helper(grid,i,j);
                }
            }
        }
        return ans;
    }
}