class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int K) {
        int n = piles.size();
        int[][] dp = new int[n+1][K+1];
        
        for(int i = 1; i <= n; i ++) {
            for(int k = 1; k <= K; k ++) {
                dp[i][k] = dp[i-1][k];
                int sum = 0;
                int picked = 1;
                for(int v: piles.get(i-1)) {
                    if(k-picked < 0) {
                        break;
                    }
                    sum += v;
                    dp[i][k] = Math.max(dp[i][k], dp[i-1][k-picked]+sum);
                    picked ++;
                }
            }
        }
        return dp[n][K];
    }
}