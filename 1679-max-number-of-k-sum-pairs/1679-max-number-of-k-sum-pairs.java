class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(k-nums[i]))
            {
                ans++;
                if(map.get(k-nums[i])==1)
                {
                   map.remove(k-nums[i]); 
                }
                else
                {
                    map.put(k-nums[i],map.get(k-nums[i])-1);
                }
            }
            else
            {
                if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
                else
                {
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }
        }
        return ans;
    }
}