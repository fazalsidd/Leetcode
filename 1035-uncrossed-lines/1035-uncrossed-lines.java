class Solution {
    public int helper(int i,int j,int[] nums1, int[] nums2,int dp[][])
    {
        if(i>=nums1.length||j>=nums2.length)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=Integer.MIN_VALUE;
        for(int k=j;k<nums2.length;k++)
        {
            if(nums1[i]==nums2[k])
           {
           ans=Math.max(ans,1+helper(i+1,k+1,nums1,nums2,dp));
                break;
           }
            
        }
        ans=Math.max(ans,helper(i+1,j,nums1,nums2,dp));
       return dp[i][j]=ans;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length][nums2.length];
         Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(0,0,nums1,nums2,dp);
    }
}