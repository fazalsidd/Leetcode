class Solution {
    public void helper(String[] strs,int visited[],int i)
    {
        visited[i]=1;
        int count=0;
        for(int j=0;j<strs.length;j++)
        {
            if(visited[j]==0)
            {
                count=0;
                for(int k=0;k<strs[i].length();k++)
                {
                   if(strs[i].charAt(k)!=strs[j].charAt(k))
                   {
                       count++;
                   }
                   if(count>2)
                   break;
                }
                if(count==0||count==2)
                helper(strs,visited,j);
            }
        }
    }
    public int numSimilarGroups(String[] strs) {
        int visited[]=new int[strs.length];
        int ans=0;
        for(int i=0;i<strs.length;i++)
        {
            if(visited[i]!=1)
            {
            ans++;
            helper(strs,visited,i);
            }
        }
        return ans;
    }
}