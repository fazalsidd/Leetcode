class Solution {
    public int maxProduct(int[] nums) {
       int pre[]=new int[nums.length];
        int pos[]=new int[nums.length];
        pre[0]=nums[0];
        int cnz=0;
        int n=0;
        int l=0;
        int temp=0;
        int pro=1;
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==0)
            {
                pre[i]=nums[i];
            }
            else
            {
                pre[i]=nums[i]*pre[i-1];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                cnz=1;
            if(nums[i]<0&&temp==0)
            {
                l=i;
                temp=1;
            }
            if(nums[i]<0)
                n++;
            if(nums[i]!=0)
            pro*=nums[i];
            
            if(cnz==1)
            ans=Math.max(ans,pro);
            else
               ans=Math.max(ans,0); 
            ans=Math.max(ans,nums[i]);
            if(nums[i]==0)
            {
                if(n%2!=0)
                {
                    if(pre[l]!=pro)
                   ans=Math.max(ans,pro/pre[l]); 
                }
                n=0;
                l=i;
                temp=0;
                pro=1;
            }
        }
        if(n%2!=0)
        {
            if(pre[l]!=pro)
            {
                ans=Math.max(ans,pro/pre[l]);
            }
        }
        return ans;
    }
}