class Solution {
     public int helper(int[] nums,int i,int dp[])
    {
        if(i==nums.length-1)
            return 1;
        
        if(i>=nums.length)
            return 0;
        
        if(nums[i]==0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        
        int ans=0;
        for(int j=1;j<=nums[i];j++)
        {
            ans=ans|helper(nums,i+j,dp);
            if(ans==1)
                break;
        }
        dp[i]= ans;
        return dp[i];
     }
    public boolean canJump(int[] nums) {
         int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int ans=helper(nums,0,dp);
        if(ans==1)
            return true;
        return false;
    }
}