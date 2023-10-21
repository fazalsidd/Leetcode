class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>(Collections.reverseOrder((a,b)->Integer.compare(a.getKey(),b.getKey())));
        int ans=Integer.MIN_VALUE;
        ans=Math.max(ans,nums[0]);
        pq.add(new Pair(nums[0],0));
        for(int i=1;i<nums.length;i++)
        {
            ans=Math.max(ans,nums[i]);
            while(!pq.isEmpty())
            {
                if(i-pq.peek().getValue()>k)
                {
                    pq.poll();
                }
                else
                {
                    break;
                }
            }
            // pair<Integer,Integer> p=pq.poll();
            // int sum=p.getKey();
            // int idx=p.getValue();
            if(!pq.isEmpty())
            {
            if(pq.peek().getKey()>=0)
            {
                if(nums[i]>=0)
                {
                    Pair<Integer,Integer> p=pq.poll();
                    ans=Math.max(ans,p.getKey()+nums[i]);
                    pq.add(new Pair(nums[i]+p.getKey(),i));
                }
                else
                {
                    ans=Math.max(ans,pq.peek().getKey()+nums[i]);
                    pq.add(new Pair(pq.peek().getKey()+nums[i],i));
                }
                // int sum=p.getKey();
                // ans=Math.max(ans,sum+nums[i]);
                // pq.add(new Pair(sum+nums[i],i));
            }
            else
            {
                pq.poll();
                pq.add(new Pair(nums[i],i));
            }
        }
            else
            {
                pq.add(new Pair(nums[i],i));
            }
        }
        return ans;
    }
}