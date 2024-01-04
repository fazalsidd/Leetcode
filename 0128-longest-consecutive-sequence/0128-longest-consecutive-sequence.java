class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> dub=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(dub.containsKey(nums[i]))
                continue;
            else
                dub.put(nums[i],i);
            
            if(map.containsKey(nums[i]-1)&&map.containsKey(nums[i]+1))
            {
                ans=Math.max(ans,(map.get(nums[i]+1)-map.get(nums[i]-1))+1);
                //System.out.println(map.get(nums[i]-1)+" "+ map.get(nums[i]+1));
                int temp=map.get(nums[i]-1);
                map.put(temp,map.get(nums[i]+1));
                map.put(map.get(nums[i]+1),temp);
            }
            else if(map.containsKey(nums[i]-1))
            {
                ans=Math.max(ans,(nums[i]-map.get(nums[i]-1))+1);
               // System.out.println(map.get(nums[i]-1)+" "+ nums[i]);
                int temp=map.get(nums[i]-1);
                map.put(nums[i],temp);
                map.put(temp,nums[i]);
            }
            else if(map.containsKey(nums[i]+1))
            {
                ans=Math.max(ans,(map.get(nums[i]+1)-nums[i])+1);
               // System.out.println(nums[i]+" "+ map.get(nums[i]+1));
                int temp=map.get(nums[i]+1);
                map.put(nums[i],temp);
                map.put(temp,nums[i]);
            }
            else
            {
               // System.out.println(nums[i]);
                map.put(nums[i],nums[i]);
                ans=Math.max(ans,1);
            }
        }
        return ans;
    }
}