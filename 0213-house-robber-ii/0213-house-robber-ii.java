class Solution {
    public int check(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            for(int j=0;j<i-1;j++)
            dp[i]=Math.max(dp[i],nums[i]+dp[j]);
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
         if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int ans=0;
        int arr[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
            arr[i]=nums[i];
        ans=check(arr);
        for(int i=1;i<nums.length;i++)
            arr[i-1]=nums[i];
        return Math.max(ans,check(arr));
    }
}
