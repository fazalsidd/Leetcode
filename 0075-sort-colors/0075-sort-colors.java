class Solution {
    public void swap(int l,int r,int[] nums)
    {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void sortColors(int[] nums) {
        int k=0;
        int l=0;
        int r=nums.length-1;
        while(k<=r)
        {
            if(k<l)
            {
                k++;
                continue;
            }
            if(nums[k]==0)
            {
                swap(l,k,nums);
                l++;
            }
            else if(nums[k]==2)
            {
                swap(k,r,nums);
                r--;
            }
            else
            {
                k++;
            }
        }
    }
}