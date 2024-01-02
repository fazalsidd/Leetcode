class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                n=Math.max(n,1);
                map.put(nums[i],2);
            }
            else
            {
                n=Math.max(map.get(nums[i]),n);
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        map.clear();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                list.get(map.get(nums[i])).add(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                list.get(0).add(nums[i]);
                map.put(nums[i],1);
            }
        }
        return list;
    }
}