class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int index=0;
        int curr=0;
        for(int i=0;i<cost.length;i++)
        {
            sum=sum+(gas[i]-cost[i]);
            curr+=(gas[i]-cost[i]);
            if(curr<0)
            {
                curr=0;
                index=i+1;
            }
        }
        if(sum>=0)
            return index;
        
        return -1;
    }
}