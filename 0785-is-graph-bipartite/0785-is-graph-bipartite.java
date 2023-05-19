class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Pair<Integer, Character>> q = new LinkedList();
        char visited[]=new char[graph.length];
        Arrays.fill(visited,'n');
        for(int j=0;j<graph.length;j++)
        {
            if(visited[j]=='n')
            {
                q.add(new Pair(j,'a'));
                visited[j]='a';
        while(!q.isEmpty())
        {
            Pair<Integer, Character> p = q.poll();
            if(visited[p.getKey()]!='n')
            {
                if(p.getValue()!=visited[p.getKey()])
                return false;
            }
            else{
                visited[p.getKey()]=p.getValue();
            }
            for(int i=0;i<graph[p.getKey()].length;i++)
            {
                if(visited[graph[p.getKey()][i]]=='n')
                {
                if(p.getValue()=='a')
                {
                    q.add(new Pair(graph[p.getKey()][i],'b'));
                    visited[graph[p.getKey()][i]]='b';
                }
                else
                {
                    q.add(new Pair(graph[p.getKey()][i],'a'));
                    visited[graph[p.getKey()][i]]='a';
                }
                }
                else
                {
                    if(visited[graph[p.getKey()][i]]==p.getValue())
                    {
                        return false;
                    }
                }
            }
        }
            }
        }
        return true;
    }
}