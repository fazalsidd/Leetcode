class Solution {
    HashMap<Integer,Boolean>map=new HashMap<>();
    public boolean helper(int[][] pre,int visited[],int i)
    {
        visited[i]=1;
        boolean ans=true;
        for(int j=0;j<pre.length;j++)
        {
            if(pre[j][0]==i&&visited[pre[j][1]]==1)
            {
                return false;
            }
            if(pre[j][0]==i&&visited[pre[j][1]]==0)
            {
                if(map.containsKey(j))
                {
                    ans=ans&&map.get(j);
                }
                else
                {
                    boolean temp=helper(pre,visited,pre[j][1]);
                    ans=ans&&temp;
                    map.put(j,temp);
                }
            }
        }
        visited[i]=0;
        return ans;
    }
    public boolean canFinish(int num, int[][] pre) {
        int visited[]=new int[num];
        boolean ans=true;
        for(int i=0;i<pre.length;i++)
            if(!map.containsKey(i))
        ans=ans&&helper(pre,visited,pre[i][0]);
        
        return ans;
    }
}