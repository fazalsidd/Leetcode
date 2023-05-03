public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int temp=n&1;
            if(temp==1)
                ans++;
            n=n>>1;
        }
        return ans;
    }
}