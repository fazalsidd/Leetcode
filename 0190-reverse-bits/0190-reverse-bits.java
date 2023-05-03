public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int temp=n&1;
            temp=temp<<(31-i);
            ans=ans|temp;
            n=n>>1;
        }
        return ans;
    }
}