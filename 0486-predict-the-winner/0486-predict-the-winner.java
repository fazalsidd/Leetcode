class Solution {
    public boolean helper(int[] nums,int front,int end,int player,int player1,int player2)
    {
        if(front>end)
        {
            if(player1>=player2)
            return true;
            else
            return false;
        }
        boolean ans1=false;
        boolean ans=true;
       // boolean ans2=false;
        if(player==0)
        {
          ans1=ans1||helper(nums,front+1,end,1,player1+nums[front],player2)||helper(nums,front,end-1,1,player1+nums[end],player2);
          return ans1;
        }
         ans=ans&&helper(nums,front+1,end,0,player1,player2+nums[front])&&helper(nums,front,end-1,0,   player1,player2+nums[end]);
       return ans;
    }
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1,0,0,0);
    }
}