class Solution {
    public void helper(int[][] heights,int vis[][],int i,int j)
    {
        if(vis[i][j]!=0)
            return;
        vis[i][j]=1;
        int ver[]={-1,+1,0,0};
        int hor[]={0,0,-1,+1};
        for(int k=0;k<4;k++)
        {
            int row=i+ver[k];
            int col=j+hor[k];
            if(row<0||row>=heights.length||col<0||col>=heights[0].length)
                continue;
            
            if(heights[row][col]>=heights[i][j])
                helper(heights,vis,row,col);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int vis1[][]=new int[heights.length][heights[0].length];
        int vis2[][]=new int[heights.length][heights[0].length];
        ArrayList<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<heights[0].length;i++)
        {
            helper(heights,vis1,0,i);
        }
        for(int i=0;i<heights.length;i++)
        {
            helper(heights,vis1,i,0);
        }
        for(int i=0;i<heights.length;i++)
        {
            helper(heights,vis2,i,heights[0].length-1);
        }
        for(int i=0;i<heights[0].length;i++)
        {
            helper(heights,vis2,heights.length-1,i);
        }
        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights[0].length;j++)
            {
                int temp=vis1[i][j]+vis2[i][j];
                if(temp==2)
                {
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(new ArrayList(list));
                }
            }
        }
        return ans;
    }
}