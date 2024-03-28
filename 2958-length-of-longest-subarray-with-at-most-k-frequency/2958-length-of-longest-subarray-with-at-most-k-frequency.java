class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Queue<Integer>> map=new HashMap<>();
        int ans=0;
        int start=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                Queue<Integer> list=map.get(nums[i]);
                while(list.peek()<start)
                {
                    list.poll();
                    if(list.size()==0)
                        break;
                }
                int index=0;
                if(list.size()!=0)
                index=list.peek();
                
                int freq=list.size();
               if(freq==k)
               {
                   start=index+1;
                   list.poll();
                   list.add(i);
                   map.put(nums[i],list);
               }
                else
                {
                   list.add(i);
                   map.put(nums[i],list); 
                }
            }
            else
            {
                Queue<Integer> temp = new LinkedList<>();
                temp.add(i);
                 map.put(nums[i],temp);
            }
            ans=Math.max(ans,i-start+1);
        }
        return ans;
    }
}