class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[]=new Boolean[s.length()];
        Arrays.fill(dp,false);
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j>=0;j--)
            {
                if(j==0)
                {
                    if(wordDict.contains(s.substring(0,i+1)))
                    dp[i]=true;
                }
                else
                {
                    if(dp[j-1]&&wordDict.contains(s.substring(j,i+1)))
                    {
                        dp[i]=true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()-1];
    }
}