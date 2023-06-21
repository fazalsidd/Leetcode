class Solution {
  public long minCost(int[] nums, int[] cost) {
    int maxi = 0, mini = 1000001;
    long ans = 0, tot = 0, t[] = new long[1000001], stepl = 0, stepr = 0;
    
    for(int i = 0; i != nums.length; i++){
      stepr += cost[i];
      if(nums[i] > maxi) maxi = nums[i];
      if(nums[i] < mini) mini = nums[i];
      t[nums[i]] += cost[i];
    }
    
    for(int i = 0; i != nums.length; i++) 
      tot += (nums[i] - mini)* (long)cost[i];
    
    ans = tot;
    for(int i = mini; i != maxi; i++){
      stepl += t[i];
      stepr -= t[i];
      tot += stepl - stepr;
      if(ans > tot) ans = tot;
      else break;
    }
    
    return ans;
  }
}