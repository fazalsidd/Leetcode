class Solution {
    public boolean helper(int[][] prerequisites,int i,int visited[],int dis[])
    {
        //  int flag=0;
            dis[i]=1;
            visited[i]=1;
         for(int j=0;j<prerequisites.length;j++)
         {
             if(prerequisites[j][0]==i)
             {
                //  flag=1;
                 if(visited[prerequisites[j][1]]==0)
                 {
                 if(helper(prerequisites,prerequisites[j][1],visited,dis))
                     return true;
                 }
                 else if(dis[prerequisites[j][1]]==1)
                 {
                     return true;
                 }
             }
         }
         dis[i]=0;
        //  if(flag==0)
        //  return false;
         return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int visited[]=new int[numCourses];
        int dis[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(visited[i]==0)
            {
                if(helper(prerequisites,i,visited,dis))
                return false;
            }
        }
        return true;
    }
}