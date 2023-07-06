class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(target<=nums[0])
            return 1;
        int ans=Integer.MAX_VALUE;
        int sum=nums[0];
        int l=0;
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            while((sum-nums[l])>=target)
            {
               sum-=nums[l];
                l++;
            }
            if(l==i)
                return 1;
            if(sum>=target)
            ans=Math.min(ans,i-l+1);
        }
        if(ans==Integer.MAX_VALUE)
        return 0;
        
        return ans;
    }
}