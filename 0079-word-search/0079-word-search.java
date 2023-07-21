class Solution {
    public boolean helper(int i,int j,int dp[][],char[][] board,int k,String word)
    {
        if(k>=word.length())
            return true;
        if(i>=board.length||j>=board[0].length||i<0||j<0)
            return false;
        if(word.charAt(k)!=board[i][j])
            return false;
        if(dp[i][j]!=0)
            return false;
        dp[i][j]=1;
        boolean ans=helper(i+1,j,dp,board,k+1,word)||helper(i,j+1,dp,board,k+1,word)||helper(i-1,j,dp,board,k+1,word)||helper(i,j-1,dp,board,k+1,word);
        dp[i][j]=0;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int dp[][]=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(helper(i,j,dp,board,0,word))
                    return true;
            }
        }
        return false;
    }
}