class Solution {
    public int jump(int[] nums) {
        int min=Integer.MAX_VALUE;
        int dp[]=new int[nums.length];
        Arrays.fill(dp,100000);
        dp[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            for(int j=i+nums[i]<nums.length?i+nums[i]:nums.length-1;j>i;j--)
            {
                dp[i]=Math.min(dp[i],1+dp[j]);
            }
        }
        return dp[0];
    }
}