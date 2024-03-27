class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int l=0;
        int r=0;
        int ans=0;
        int pro=1;
        while(r<nums.length)
        {
            pro*=nums[r];
                while(pro>=k&&l<=r)
                {
                    pro=pro/nums[l];
                    l++;
                }
            ans+=(r-l)+1;
            r++;
        }
        return ans;
    }
}