class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int p=0;
        int n=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                neg[n]=nums[i];
                n++;
            }
            else
            {
                pos[p]=nums[i];
                p++;
             }
        }
        p=0;
        n=0;
        while(k<nums.length)
        {
            if(p<nums.length/2)
            {
                nums[k]=pos[p];
                k++;
                p++;
            }
            if(n<nums.length/2)
            {
                nums[k]=neg[n];
                k++;
                n++;
            }
        }
        return nums;
    }
}