class Solution {
    public int[] searchRange(int[] nums, int t) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r)
        {
           mid=(l+r)/2;
            if(nums[mid]>t)
                r=mid-1;
            else if(nums[mid]<t)
                l=mid+1;
            else
            {
                ans[0]=mid;
                r=mid-1;
            }
        }
         l=0;
        r=nums.length-1;
        mid=0;
        while(l<=r)
        {
           mid=(l+r)/2;
            if(nums[mid]>t)
                r=mid-1;
            else if(nums[mid]<t)
                l=mid+1;
            else
            {
                ans[1]=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}