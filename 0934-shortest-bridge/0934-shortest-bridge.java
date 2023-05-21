class Solution {
    public class Pair{
        int r;
        int c;
        Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    Queue<Pair> que = new ArrayDeque<>();
    int[][] calls = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    boolean[][] visited;       
    
    public int shortestBridge(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length]; 
        boolean found = false;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    que.add(new Pair(i, j));
                    dfs(i, j, grid);
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }        

        while(que.size() > 0) {
        	Pair rem = que.remove();
        	visited[rem.r][rem.c] = true;
        	for(int i = 0; i < 4; i++){
                int nr = rem.r + calls[i][0];
                int nc = rem.c + calls[i][1];                
                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && visited[nr][nc] == false) {
                	if(grid[nr][nc] == 0) {
                		grid[nr][nc] = grid[rem.r][rem.c] + 1;
                		que.add(new Pair(nr, nc));
                	}
                	else if(grid[nr][nc] == 1)
                		return grid[rem.r][rem.c] - 1;
                }
            }
        }      
        return 0;
    }
    
    public void dfs(int r, int c, int[][] grid){
        visited[r][c] = true;
        for(int i = 0; i < 4; i++){
            int nr = r + calls[i][0];
            int nc = c + calls[i][1];
            if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && visited[nr][nc] == false && grid[nr][nc] == 1) {
                que.add(new Pair(nr, nc));
                dfs(nr, nc, grid);
            }
        }
    }
}