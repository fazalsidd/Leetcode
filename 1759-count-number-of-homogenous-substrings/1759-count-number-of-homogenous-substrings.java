class Solution {
    public int countHomogenous(String s) {
        char[] ch=s.toCharArray();
        long count=1;
        long ans=0;
        int mod=1000000007;
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i]!=ch[i-1])
            {
               ans+=(((count%mod)*((count+1)%mod))/2)%mod;
               ans=ans%mod;
               count=1;
            }
            else
            {
                count++;
                count=count%mod;
            }
        }
        ans+=(((count%mod)*((count+1)%mod))/2)%mod;
        return (int)ans%mod;
    }
}