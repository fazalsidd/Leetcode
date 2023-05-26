class Solution {

    private int[][][] dp;

    public int stoneGameII(int[] piles) {
        dp = new int[2][piles.length][piles.length * 2];
        for(int[][] d1 : dp) for(int[] d2 : d1) Arrays.fill(d2, -1);

        return helper(0, 1, true, piles);
    }

    private int helper(int i, int m, boolean aliceTurn, int[] piles) {
        if(i >= piles.length) return 0;

        int idx = aliceTurn ? 0 : 1;
        if(dp[idx][i][m] > -1) return dp[idx][i][m];

        int stones = aliceTurn? 0 : Integer.MAX_VALUE, current = 0;
        for(int j = i; j < 2 * m + i && j < piles.length; j++) {
            int x = j - i + 1;
            if(aliceTurn) {
                current += piles[j];
                stones = Math.max(stones, current + helper(j + 1, Math.max(m, x), !aliceTurn, piles));
            } else {
                stones = Math.min(stones, helper(j + 1, Math.max(m, x), !aliceTurn, piles));
            }
        }

        dp[idx][i][m] = stones;
        return stones;
    }
}