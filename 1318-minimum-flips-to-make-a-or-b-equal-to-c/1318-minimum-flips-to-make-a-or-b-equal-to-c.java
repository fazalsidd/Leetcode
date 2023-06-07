class Solution {
    public int minFlips(int a, int b, int c) {
        int ans=0;
        int a1,b1,c1=0;
        while(c!=0)
        {
            c1=c&1;
            a1=a&1;
            b1=b&1;
            if(c1==0)
            {
                if(a1==1&&b1==1)
                {
                    ans+=2;
                }
                else if(a1==0&&b1==0)
                {
                    ans+=0;
                }
                else
                {
                    ans+=1;
                }
            }
            else
            {
                if(a1==0&&b1==0)
                {
                    ans+=1;
                }
                else
                {
                    ans+=0;
                }
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        while(a!=0)
        {
            a1=a&1;
            if(a1==1)
                ans++;
            a=a>>1;
        }
        while(b!=0)
        {
            b1=b&1;
            if(b1==1)
                ans++;
            b=b>>1;
        }
        return ans;
    }
}