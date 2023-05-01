class Solution {
    public int countSubstrings(String s) {
     ArrayList<Integer>[] dp = new ArrayList[s.length()];
        char[] c = s.toCharArray();
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            dp[i] = new ArrayList<Integer>();
        }
        dp[0].add(0);
        ans++;
        for(int i=1;i<s.length();i++)
        {
            dp[i].add(i);
            for(int j=0;j<dp[i-1].size();j++)
            {
                int index=dp[i-1].get(j);
                if(index!=0)
                {
                    if(c[index-1]==c[i])
                        dp[i].add(index-1);
                }
            }
            if(c[i]==c[i-1]&&!dp[i].contains(i-1))
                dp[i].add(i-1);
            ans+=dp[i].size();
        }
        return ans;
    }
}