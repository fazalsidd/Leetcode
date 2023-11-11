class Graph {
    List<List<Pair<Integer, Integer>>> g;
    public Graph(int n, int[][] edges) {
        g = new ArrayList<>(n);
        for(int i = 0; i < n; ++i) g.add(new ArrayList<>());
        for(int[] e: edges) addEdge(e);
    }
    
    public void addEdge(int[] edge) {
        g.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
    }
    
    public int shortestPath(int node1, int node2) {
        int minPath = -1;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> vis = new ArrayList<>(Collections.nCopies(g.size(), Integer.MAX_VALUE));
        q.add(node1);
        vis.set(node1, 0);
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == node2) minPath = vis.get(node);
            for(Pair<Integer, Integer> pair: g.get(node)){
                int n = pair.getKey(), c = pair.getValue();
                if(vis.get(n) < vis.get(node) + c) continue;
                q.add(n);
                vis.set(n, vis.get(node) + c);
            }
        }
        return minPath;
    }
}
/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */