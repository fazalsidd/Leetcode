class Solution {
    long dp[]=new long[100001];
    public long helper(int i,int[] nums, int k)
    {
        if(i>=nums.length)
            return 0;
        if(dp[i]!=-1)
          return  dp[i];
        long a=Math.max(k-nums[i],0)+helper(i+1,nums,k);
        long b=Math.max(k-nums[i],0)+helper(i+2,nums,k);
        long c=Math.max(k-nums[i],0)+helper(i+3,nums,k);
        
        return dp[i]=Math.min(a,Math.min(b,c));
    }
    public long minIncrementOperations(int[] nums, int k) {
        long ans=0;
//         PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>(Collections.reverseOrder((a,b)->Integer.compare(a.getKey(),b.getKey())));
//         pq.add(new Pair(nums[0],0));
//         pq.add(new Pair(nums[1],1));
//         int l=0;
//         for(int i=2;i<nums.length;i++)
//         {
//             pq.add(new Pair(nums[i],i));
//             while(!pq.isEmpty())
//             {
//                 Pair<Integer,Integer> p=pq.poll();
//                 int n=p.getKey();
//                 int idx=p.getValue();
//                 if(idx>=l&&idx<=i)
//                 {
//                     while(pq.peek().getKey()==n)
//                    {
//                     if(pq.peek().getValue()<idx)
//                     {
//                         pq.poll();
//                     }
//                         else
//                         {
//                             n=pq.peek().getKey();
//                             idx=pq.peek().getValue();
//                             pq.poll();
//                         }
//                    }
//                     if(n>=k)
//                     {
//                         pq.add(new Pair(n,idx));
//                     }
//                     else
//                     {
//                        ans+=(k-n);
//                         pq.add(new Pair(k,idx));
//                     }
//                     break;
//                 }
        
//             }
//             l++;
//         }
        Arrays.fill(dp,-1);
        ans=helper(0,nums,k);
        ans=Math.min(ans,helper(1,nums,k));
        ans=Math.min(ans,helper(2,nums,k));
        return ans;
    }
}