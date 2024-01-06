class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int nums[][]=new int[profit.length][3];
        int dp[]=new int[profit.length];
        for(int i=0;i<profit.length;i++)
        {
            nums[i][0]=startTime[i];
            nums[i][1]=endTime[i];
            nums[i][2]=profit[i];
        }
        Arrays.sort(nums,(a, b) -> Integer.compare(a[0],b[0]));
        dp[profit.length-1]=nums[profit.length-1][2];
        for(int i=profit.length-2;i>=0;i--)
        {
            int l=i+1;
            int r=profit.length-1;
            int mid=-1;
            int in=-1;
            dp[i]=nums[i][2];
            while(l<=r)
            {
                mid=(l+r)/2;
                if(nums[mid][0]>=nums[i][1])
                {
                    in=mid;
                    r=mid-1;
                }
                else
                    {
                    l=mid+1;
                }
            }
            if(in!=-1)
                dp[i]=nums[i][2]+dp[in];
            
            dp[i]=Math.max(dp[i],dp[i+1]);
        }
        return dp[0];
    }
}