class Solution {
    public int longestSubarray(int[] nums) {
      int flag=0;
        int gsum=0;
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                sum+=1;
                gsum+=1;
            }
            if(nums[i]==0&&flag==0)
               {
                flag=1;
               sum=0;
               }
            else if(nums[i]==0&&flag==1)
            {
               //System.out.println(gsum);
                ans=Math.max(ans,gsum);
                gsum=sum;
                sum=0;
            }
        }
        if(flag==0)
            return gsum-1;
        return ans=Math.max(ans,gsum);
    }
}