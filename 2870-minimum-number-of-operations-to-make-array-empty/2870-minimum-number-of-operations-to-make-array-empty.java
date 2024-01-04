class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int ans=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(count==1)
                    return -1;
                if(count%3==0)
                    ans+=(count/3);
                else if(count%3==1)
                    ans+=(count/3)+1;
                else
                    ans+=(count/3)+1;
                
                count=1;
            }
            else
            {
                count++;
            }
        }
         if(count==1)
                return -1;
        
                if(count%3==0)
                    ans+=(count/3);
                else if(count%3==1)
                    ans+=(count/3)+1;
                else
                    ans+=(count/3)+1;
        
        return ans;
    }
}