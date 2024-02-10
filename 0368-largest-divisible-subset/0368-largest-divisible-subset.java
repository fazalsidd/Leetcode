class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int index=0;
        int max=1;
        int dp[][]=new int[nums.length][2];
        dp[0][0]=1;
        dp[0][1]=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            dp[i][0]=1;
            dp[i][1]=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]%nums[j]==0)
                {
                    if(dp[j][0]+1>dp[i][0])
                    {
                       dp[i][0]=dp[j][0]+1; 
                        dp[i][1]=j;
                    }
                }
            }
            if(dp[i][0]>max)
            {
                max=dp[i][0];
                index=i;
            }
        }
        while(dp[index][1]!=-1)
        {
            ans.add(nums[index]);
            index=dp[index][1];
        }
        ans.add(nums[index]);
        return ans;
        }
}