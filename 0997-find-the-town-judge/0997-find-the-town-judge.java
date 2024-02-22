class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0)
        {
            if(n==1)
                return 1;
        else 
            return -1;
        }
        int tru[]=new int[n+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++)
        {
            tru[trust[i][1]]++;
            map.put(trust[i][0],0);
        }
        for(int i=0;i<=n;i++)
        {
            if(tru[i]==n-1&&!map.containsKey(i))
                return i;
        }
        return -1;
    }
}