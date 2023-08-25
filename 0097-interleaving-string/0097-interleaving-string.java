class Solution {
    
    private boolean solve(String s1, String s2, String s3, int i1, int i3, Boolean[][] dp) {
        if (i3 == s3.length()) return true;
        if (dp[i1][i3] != null) return dp[i1][i3];
        int i2 = i3-i1;
        boolean ans = false;
        if (i1<s1.length() && s1.charAt(i1) == s3.charAt(i3)) {
            ans = ans || solve(s1, s2, s3, i1+1, i3+1, dp);
        }
        if (!ans && i2<s2.length() && s2.charAt(i2) == s3.charAt(i3)) {
            ans = ans || solve(s1, s2, s3, i1, i3+1, dp);
        }
        return dp[i1][i3] = ans;
    }
    
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean[][] dp = new Boolean[s1.length()+1][s3.length()+1];
        if (s1.length() + s2.length() != s3.length()) return false;
        return solve(s1,s2,s3,0,0, dp);
    }
}