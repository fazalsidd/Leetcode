class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            int l=0;
            int r=grid[0].length-1;
            int mid=0;
            int min=101;
            while(l<=r)
            {
                mid=(l+r)/2;
                if(grid[i][mid]>=0)
                {
                    l=mid+1;
                }
                else
                {
                    min=Math.min(min,mid);
                    r=mid-1;
                }
            }
            if(min!=101)
            ans+=(grid[0].length-min);
        }
        return ans;
    }
}