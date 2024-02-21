class Solution {
    public int helper(int[][] grid,int i,int j)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0)
            return 0;
        
        grid[i][j]=0;
       int a=helper(grid,i+1,j);
       int b=helper(grid,i,j+1);
       int c=helper(grid,i-1,j);
       int d=helper(grid,i,j-1);
        
        return 1+a+b+c+d;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                   ans=Math.max(helper(grid,i,j),ans);
                    
                }
            }
        }
        return ans;
    }
}