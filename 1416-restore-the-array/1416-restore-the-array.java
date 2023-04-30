class Solution {
   public int numberOfArrays(String s, int k) {
    long[] dp = new long[s.length() + 1];
    dp[s.length()] = 1;
    for(int i = s.length() - 1; i >= 0; i--) {
        long cur = 0;
        if(s.charAt(i) != '0') {
            for(int j = i; j < s.length(); j++) {
                cur = cur * 10 + (s.charAt(j) - '0');
                if(cur > k) break;
                dp[i] = (dp[i] + dp[j + 1]) % 1000000007;
            }
        }
    }
    return (int)dp[0];
}
}