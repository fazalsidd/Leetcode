class Solution {
    public void helper(int[][] isConnected,int visited[],int i)
    {
        for(int j=0;j<isConnected[i].length;j++)
        {
            if(visited[j]==0&&isConnected[i][j]==1)
            {
                visited[j]=1;
                helper(isConnected,visited,j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int province=0;
        int visited[]=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++)
        {
            if(visited[i]==0)
            {
                province++;
                visited[i]=1;
                helper(isConnected,visited,i);
            }
        }
        return province;
    }
}