class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair<Integer, Integer>> q= new PriorityQueue<Pair<Integer, Integer>>((a, b) -> a.getValue() - b.getValue());
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> j : map.entrySet())
        {
            if(k>0)
            {
                q.add(new Pair(j.getKey(),j.getValue()));
                    k--;
                }
                else
                {
                    if(j.getValue()>q.peek().getValue())
                    {
                        q.remove();
                         q.add(new Pair(j.getKey(),j.getValue()));
                    }
                }
        }
        
        while(!q.isEmpty())
        {
           ans[k]=q.remove().getKey();
            k++;
        }
        return ans;
    }
}