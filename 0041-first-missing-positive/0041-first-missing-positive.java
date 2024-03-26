class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]<=0)
                i++;
            else if(nums[i]>n)
                i++;
            else if(i+1==nums[i])
                i++;
            else
            {
                int j=nums[i]-1;
                if(nums[j]==nums[i])
                    nums[i]=0;
                else
                {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]<=0||nums[i]>n)
                return i+1;
        }
        
        return n+1;
    }
}