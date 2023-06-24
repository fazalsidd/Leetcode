class Solution {
    public int tallestBillboard(int[] rods) {
        int [][] dp= new int [rods.length][10004];
        for(int [] a: dp) Arrays.fill(a,-1);
        return help(rods,0,rods.length-1,dp);
    }
    public int help(int [] rod, int diff, int idx ,int [][]dp){
        if(idx<0){
            if(diff==0) return 0;
            return -999999999;
        }
        if(dp[idx][diff+5000]!=-1) return dp[idx][diff+5000];
       
        int notPick = help(rod,diff,idx-1,dp);
        int pick1 = rod[idx] + help(rod,diff+rod[idx],idx-1,dp);
        int pick2 = help(rod,diff-rod[idx],idx-1,dp);

        return dp[idx][diff+5000]=Math.max(notPick,Math.max(pick1,pick2));
    }
}