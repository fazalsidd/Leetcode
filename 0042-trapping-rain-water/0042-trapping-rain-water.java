class Solution {
    public int trap(int[] h) {
        int count=0;
        int prev=h[0];
        int ans=0;
        int sum=0;
        int idx=0;
        for(int i=1;i<h.length;i++)
        {
            sum+=h[i];
            count+=1;
            if(h[i]>=prev)
            {
                sum=sum-h[i];
                count-=1;
                ans+=((prev*count)-sum);
                prev=h[i];
                sum=0;
                count=0;
                idx=i;
               // System.out.println(ans);
            }
        }
        count=0;
        prev=h[h.length-1];
        sum=0;
        for(int i=h.length-2;i>=idx;i--)
        {
            sum+=h[i];
            count+=1;
            if(h[i]>=prev)
            {
                sum=sum-h[i];
                count-=1;
                ans+=((prev*count)-sum);
                prev=h[i];
                sum=0;
                count=0;
               // System.out.println(ans);
            }
        }
        return ans;
    }
}