class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int ans=Integer.MIN_VALUE;
        while(l<r)
        {
            ans=Math.max(ans,Math.min(h[l],h[r])*(r-l));
            if(h[l]<h[r])
                l++;
            else
                r--;
        }
        return ans;
    }
}