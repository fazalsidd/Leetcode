class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            //System.out.println(nums[mid]);
            if(nums[mid]==target)
                return mid;
            if(nums[r]>=nums[l])
            {
                if(nums[mid]<target)
                    l=mid+1;
                    else
                        r=mid-1;
            }
            else{
                if((target<nums[mid]&&target<=nums[l]&&nums[mid]<nums[l])||(target>nums[mid]&&target>=nums[l]&&nums[mid]<nums[r])||(target<nums[mid]&&target>=nums[l]&&nums[mid]>nums[r]))
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
                     return -1;
    }
}