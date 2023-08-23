class Solution {
    public void add(int l,int mid,int r,int[] nums)
    {
        int temp[]=new int[(r-l)+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=r)
        {
            if(nums[i]<nums[j])
            {
                temp[k]=nums[i];
                i++;
            }
            else
            {
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
           temp[k]=nums[i];
                i++; 
            k++;
        }
        while(j<=r)
        {
           temp[k]=nums[j];
                j++; 
            k++;
        }
        for(i=0;i<k;i++)
        {
            nums[l]=temp[i];
            l++;
        }
    }
    public void merge(int l,int r,int[] nums)
    {
        if(l>=r)
        return;
        int mid=(l+r)/2;
        merge(l,mid,nums);
        merge(mid+1,r,nums);
        add(l,mid,r,nums);
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        int j=nums.length-1;
        int ind=0;
        int dif=Integer.MAX_VALUE;
        for(i=nums.length-2;i>=0;i--)
        {
            for(j=nums.length-1;j>i;j--)
            {
                if(nums[j]>nums[i]&&(nums[j]-nums[i])<dif)
                {
                    ind=j;
                    dif=nums[j]-nums[i];
                }
            }
            if(dif!=Integer.MAX_VALUE)
            {
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        //merge(i+1,nums.length-1,nums);
        if(dif==Integer.MAX_VALUE)
            merge(0,nums.length-1,nums);
        else
        merge(i+1,nums.length-1,nums);
    }
}