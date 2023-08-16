class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            map.put(nums[i],i);
            pq.add(nums[i]);
        }
        list.add(pq.peek());
        for(int i=k;i<nums.length;i++)
        {
                map.put(nums[i],i);
            pq.add(nums[i]);
            if(map.get(pq.peek())<=i-k)
            {
                pq.poll();
                while(map.get(pq.peek())<=i-k)
                {
                    pq.poll();
                }
            }
                list.add(pq.peek());
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
           ans[i]=list.get(i);
        }
        return ans;
    }
}