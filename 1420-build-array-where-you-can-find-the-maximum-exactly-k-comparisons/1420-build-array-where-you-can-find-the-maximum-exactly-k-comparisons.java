class Solution {
    long res=0;
    Long dp[][][];
    int N, M, K, mod=1000000007;
    public int numOfArrays(int n, int m, int k) {
        dp=new Long[n][m][k];
        N=n; M=m; K=k;
        long res=0;
        for(int i=1; i<=m; i++) res+=f(1, i, 1)%mod;
        return (int)(res%mod);
    }
    private long f(int n, int m, int k) {
        if(n==N) return k==K? 1: 0;
        if(k>K || K-k>N-n) return 0;
        if(dp[n][m-1][k-1]!=null) return dp[n][m-1][k-1];
        long res=(m * f(n+1, m, k))%mod;
        for(int i=m+1; i<=M; i++) 
            res=(res+f(n+1, i, k+1))%mod;
        return dp[n][m-1][k-1]=res;
    }
}