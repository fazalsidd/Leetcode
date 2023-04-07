class Solution {
    public boolean helper(int[][] board,int i,int j,int visited[][],int k)
    {
        if(i>=board.length||j>=board[0].length||i<0||j<0)
            return true;
         
           if(board[i][j]==0)
              return false;
              
              if(visited[i][j]!=-1)
              return false;
           
           visited[i][j]=k;

           boolean left=false;
           boolean right=false;
           boolean up=false;
           boolean down=false;

         
            left=helper(board,i,j-1,visited,k);

         
            right=helper(board,i,j+1,visited,k);

           
            up=helper(board,i-1,j,visited,k);

            down=helper(board,i+1,j,visited,k);
              
           return left||right||up||down;
    }
    public int numEnclaves(int[][] board) {
        int visited[][]=new int[board.length][board[0].length];
           Arrays.stream(visited).forEach(a -> Arrays.fill(a, -1));
          int k=0;
          ArrayList<Boolean> list =  new ArrayList<Boolean>();
          int ans=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==1 && visited[i][j]==-1)
                {
                     list.add(helper(board,i,j,visited,k));
                     k++;
                }
                if(visited[i][j]!=-1)
                {
                    if(!list.get(visited[i][j]))
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}