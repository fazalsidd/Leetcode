class Solution {
    public void nextPermutation(int[] nums) {
        int min=100000;
        int i=nums.length-2;
        int index=-1;
        for(;i>=0;i--)
        {
           for(int j=i+1;j<nums.length;j++)
           {
               if(nums[j]>nums[i])
               {
                   if((nums[j]-nums[i])<min)
                   {
                       min=nums[j]-nums[i];
                       index=j;
                   }
               }
           }
            if(index!=-1)
            {
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                Arrays.sort(nums,i+1,nums.length);
                break;
            }
        }
        if(index==-1)
            Arrays.sort(nums);
    }
}