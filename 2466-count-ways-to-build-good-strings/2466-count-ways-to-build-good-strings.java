class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[]=new int[high+1];
        Arrays.fill(dp,-1);
        int ans=0;
        for(int i=low;i<=high;i++){
            ans=((ans%1000000007)+(helper(i,dp,zero,one)%1000000007))%1000000007;
        }
        return ans;
    }
    public int helper(int i,int[] dp,int zero,int one){
        if(i==0)
            return 1;
        if(i<0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int forzero=helper(i-zero,dp,zero,one);
        int forone=helper(i-one,dp,zero,one);
        return dp[i]=(forzero+forone)%1000000007;
    }
}