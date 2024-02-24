class Solution {
    public void helper(ArrayList<ArrayList<Pair<Integer,Integer>>> adj,int vis[],int fp,int time,int ans[])
    {
        if(time>=ans[fp])
            return;
        
        ans[fp]=time;
        
        if(vis[fp]!=0)
            return ;
        
        vis[fp]=1;
        ArrayList<Pair<Integer,Integer>> list=adj.get(fp);
        for(int i=0;i<list.size();i++)
        {
            int n=list.get(i).getKey();
            int t=list.get(i).getValue();
            if(t>=time)
            {
                helper(adj,vis,n,t,ans);
            }
        }
        vis[fp]=0;
    }
    public List<Integer> findAllPeople(int num, int[][] pre, int fp) {
        int vis[]=new int[num];
        ArrayList<ArrayList<Pair<Integer,Integer>>> adj=new ArrayList<>();
        Arrays.sort(pre,(a,b)->Integer.compare(a[2],b[2]));
        for(int i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++)
        {
            adj.get(pre[i][0]).add(new Pair(pre[i][1],pre[i][2]));
            adj.get(pre[i][1]).add(new Pair(pre[i][0],pre[i][2]));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int sec[]=new int[num];
        Arrays.fill(sec,Integer.MAX_VALUE);
        helper(adj,vis,0,0,sec);
        helper(adj,vis,fp,0,sec);
        for(int i=0;i<num;i++)
            if(sec[i]!=Integer.MAX_VALUE||i==0||i==fp)
                ans.add(i);
        
        return ans;
    }
}