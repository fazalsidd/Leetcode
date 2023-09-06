class Solution {
    public boolean helper(int[][] pre,int i,int visited[],HashMap<Integer,ArrayList<Integer>>map)
    {
        if(visited[i]!=0)
        {
            if(visited[i]==-1)
                return false;
            else
                return true;
        }
        if(!map.containsKey(i))
            return true;
        visited[i]=-1;
        for(int j=0;j<map.get(i).size();j++)
        {
            if(!helper(pre,map.get(i).get(j),visited,map))
                return false;
        }
        visited[i]=1;
        return true;
    }
    public boolean canFinish(int num, int[][] pre) {
        int visited[]=new int[num];
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<pre.length;i++)
        {
            if(map.containsKey(pre[i][0]))
            {
                ArrayList<Integer>list=map.get(pre[i][0]);
                list.add(pre[i][1]);
                map.put(pre[i][0],list);
            }
            else
            {
                ArrayList<Integer>list=new ArrayList<>();
                list.add(pre[i][1]);
                map.put(pre[i][0],list);
            }
        }
        for(int i=0;i<num;i++)
        {
                if(!helper(pre,i,visited,map))
                    return false;
        }
        return true;
    }
}