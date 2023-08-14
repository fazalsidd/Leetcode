class Solution {
    public boolean helper(int[] nums,int j,int[] dp)
    {
        if(j==nums.length-1)
        return false;
        if(j==nums.length)
        return true;
        if(j==nums.length-2)
        {
            if(nums[j]==nums[j+1])
            return true;

            return false;
        }
        if(dp[j]!=0)
        {
            if(dp[j]==-1)
            return false;

            return true;
        }
        boolean ans=false;
        for(int i=j;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                ans=helper(nums,i+2,dp);
                if(nums[i]==nums[i+2])
                ans=ans||helper(nums,i+3,dp);
                break;
            }
            else
            {
                if(nums[i]!=nums[i+1]-1||nums[i]!=nums[i+2]-2)
                {
                    ans=false;
                }
                else
                {
                    ans=helper(nums,i+3,dp);
                }
                break;
            }
        }
        if(ans)
        dp[j]=1;
        else
        dp[j]=-1;

        return ans;
    }
    public boolean validPartition(int[] nums) {
        int dp[]=new int[nums.length];
        return helper(nums,0,dp);
    }
}