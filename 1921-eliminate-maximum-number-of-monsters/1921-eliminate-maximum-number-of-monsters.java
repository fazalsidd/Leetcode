class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int i=1;
        double[] nums = new double[dist.length];
        
        for(i=0;i<dist.length;i++){
            nums[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(nums);
        int ans=1;
        int k=1;
        i=1;
        while(k<nums.length)
        {
            if(nums[k]>i)
                ans++;
            else
                return ans;
                k++;
            i++;
        }
        return ans;
    }
}