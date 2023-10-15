class Solution {
public int[] findIndices(int[] num,int in,int va)
{
    int ans[]=new int[2];
    ans[0]=-1;
    ans[1]=-1;
    int nums[][]=new int[num.length][2];
    for(int i=0;i<num.length;i++)
    {
        nums[i][0]=num[i];
        nums[i][1]=i;
    }
    Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
    // for(int i=0;i<num.length;i++)
    // {
    //     System.out.println(nums[i][0]+" "+nums[i][1]);
    // }
    int mini=Integer.MAX_VALUE;
    int maxi=Integer.MIN_VALUE;
    int l=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i][0]-nums[l][0]>=va)
        {
            mini=Math.min(mini,nums[l][1]);
            maxi=Math.max(maxi,nums[l][1]);
            while(l<=i)
            {
                if((nums[i][0]-nums[l][0])>=va)
                {
                mini=Math.min(mini,nums[l][1]);
                 maxi=Math.max(maxi,nums[l][1]);
                if(Math.abs(nums[i][1]-mini)>=in)
                {
                    ans[0]=mini;
                    ans[1]=nums[i][1];
                    return ans;
                }
                if(Math.abs(nums[i][1]-maxi)>=in)
                {
                    ans[0]=nums[i][1];
                    ans[1]=maxi;
                    return ans;
                }
                l++;
                }
                else
                {
                    l-=1;
                    break;
                }
            }
        }
    }
    return ans;
}
}
