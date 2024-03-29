class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
        return nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int val=map.get(nums[i])+1;
                if(val>nums.length/2)
                {
                    return nums[i];
                }
                map.put(nums[i],val);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        return -1;
    }
}