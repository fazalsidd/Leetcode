class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)->a[0]-b[0]);
        int r=in[0][1];
        int index=0;
        for(int i=1;i<in.length;i++)
        {
           if(in[i][0]<=r)
           {
               r=Math.max(r,in[i][1]);
           }
            else
            {
                in[index][1]=r;
                r=in[i][1];
                index++;
                in[index][0]=in[i][0];
            }
        }
        in[index][1]=r;
        int ans[][]=new int[index+1][2];
        for(int j=0;j<=index;j++)
        {
            ans[j][0]=in[j][0];
            ans[j][1]=in[j][1];
        }
        return ans;
    }
}