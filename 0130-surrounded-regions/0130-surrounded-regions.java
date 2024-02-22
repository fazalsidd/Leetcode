class Solution {
    public void helper(char[][] board,int i,int j,int m,int n)
    {
        if(i<0||i>=m||j<0||j>=n)
            return;
        if(board[i][j]=='k'||board[i][j]=='X')
            return;
        board[i][j]='k';
        helper(board,i+1,j,m,n);
        helper(board,i,j+1,m,n);
        helper(board,i-1,j,m,n);
        helper(board,i,j-1,m,n);
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<n;i++)
        {
            if(board[0][i]=='O')
                helper(board,0,i,m,n);
        }
        for(int i=0;i<n;i++)
        {
            if(board[m-1][i]=='O')
                helper(board,m-1,i,m,n);
        }
        for(int i=0;i<m;i++)
        {
            if(board[i][0]=='O')
                helper(board,i,0,m,n);
        }
        for(int i=0;i<m;i++)
        {
            if(board[i][n-1]=='O')
                helper(board,i,n-1,m,n);
        }
        for(int i=0;i<m;i++)
        {
            for(int  j=0;j<n;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
                
                if(board[i][j]=='k')
                    board[i][j]='O';
            }
        }
        
    }
}