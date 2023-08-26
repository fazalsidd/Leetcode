class Solution {
    public int search(int[][] pair,int i)
    {
        int lo=0;
        int hi=pair.length-1;
        int mid;
        int ans=Integer.MAX_VALUE;
        while(lo<=hi)
        {
             mid = lo+(hi-lo)/2;
             if(pair[mid][0]<=pair[i][1])
             {
                 lo=mid+1;
             }
             else
             {
                 ans=Math.min(ans,mid);
                 hi=mid-1;
             }
        }
        if(ans==Integer.MAX_VALUE)
        return -1;

        return ans;
    }
    public int findLongestChain(int[][] pairs) {
        int dp[]=new int[pairs.length];
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int n=pairs.length;
        dp[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            int idx=search(pairs,i);
            if(idx==-1)
            dp[i]=1;
            else
            dp[i]=1+dp[idx];

            dp[i]=Math.max(dp[i],dp[i+1]);
        }
        return dp[0];
    }
}