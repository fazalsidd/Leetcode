class Solution {
    public int helper(int[] arr,int l,int r,int dp[][])
    {
        if(l==r)
            return 0;
        if(dp[l][r]!=-1)
            return dp[l][r];
        
        PriorityQueue<Pair<Integer,Integer>> q= new PriorityQueue<>(Collections.reverseOrder((a,b) -> Integer.compare(a.getKey(),b.getKey())));
        
        for(int i=r;i>=l;i--)
        {
            q.add(new Pair(arr[i],i));
        }
        
        int max=arr[l];
        int ans=Integer.MAX_VALUE;
        
        for(int i=l;i<r;i++)
        {
            max=Math.max(max,arr[i]);
            while(q.peek().getValue()<=i)
            {
                q.poll();
            }
            //System.out.println(max+" "+q.peek().getKey()+" "+q.peek().getValue());
            ans=Math.min(ans,(max*q.peek().getKey())+helper(arr,l,i,dp)+helper(arr,i+1,r,dp));
        }
        return dp[l][r]=ans;
    }
    public int mctFromLeafValues(int[] arr) {
        int dp[][]=new int[41][41];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(arr,0,arr.length-1,dp);
    }
}