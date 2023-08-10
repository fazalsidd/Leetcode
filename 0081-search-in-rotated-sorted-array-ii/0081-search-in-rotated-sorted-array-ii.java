class Solution {
    public boolean search(int[] nums, int target) {
        int mid=-1;
        if(nums.length==1)
        {
            if(nums[0]==target)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(nums[0]==target)
        {
            return true;
        }
        int i=1;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return true;
            }
            if(i==nums.length-1)
            {
                return false;
            }
             if(nums[i]<nums[i-1])
            {
                break;
            }
        }
       int end=nums.length-1;
         while(i<=end)
        {
            mid=(i+end)/2;
        if(nums[mid]<target)
        {
            i=mid;
        }
        else if(nums[mid]>target)
        {
            end=mid;
        }
        else
        {
          return true;  
        }
              if(end==i+1||end==i)
            {
                if(nums[end]==target)
                {
                    return true;
                }
                else
                {
                    break;
                }
            }
        }
        return false;
    }
}