class Solution {
    public void helper(int[][] land,int i,int j,int count)
    {
        if(i<0||j<0||i>=land.length||j>=land[0].length)
            return;
        
        if(land[i][j]!=1)
            return;
        
        land[i][j]=count;
        helper(land,i+1,j,count);
        helper(land,i,j+1,count);
        helper(land,i-1,j,count);
        helper(land,i,j-1,count);
    }
    public int[][] findFarmland(int[][] land) {
        int count=2;
        for(int i=0;i<land.length;i++)
        {
            for(int j=0;j<land[0].length;j++)
            {
                if(land[i][j]==1)
                {
                    helper(land,i,j,count);
                    count+=1;
                }
            }
        }
        int ans[][]=new int[count-2][4];
        Arrays.stream(ans).forEach(a -> Arrays.fill(a, -1));
        for(int i=0;i<land.length;i++)
        {
            for(int j=0;j<land[0].length;j++)
            {
                if(land[i][j]!=0)
                {
                    int index=land[i][j]-2;
                    if(ans[index][0]==-1&&ans[index][1]==-1)
                    {
                        ans[index][0]=i;
                        ans[index][1]=j;
                    }
                    ans[index][2]=i;
                    ans[index][3]=j;
                }
            }
        }
        return ans;
    }
}