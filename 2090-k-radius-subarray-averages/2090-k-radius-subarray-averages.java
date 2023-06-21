class Solution {
  public int[] getAverages(int[] nums, int k) {
    long prefix[] = new long[nums.length];
    int ans[] = new int[nums.length];

    long pre = 0;
    for (int i = 0; i < nums.length; i++) {
      pre = pre + nums[i];
      prefix[i] = pre;
    }
    for (int i = 0; i < nums.length; i++) {
      if (i - k < 0 || i + k >= nums.length) {
        ans[i] = -1;
        continue;
      }

      if (i - k - 1 < 0) {
        ans[i] += prefix[i + k] / (2 * k + 1);
        continue;
      }
     
      ans[i] += (prefix[i + k] - prefix[i - k - 1]) / (2 * k + 1);
    }

    return ans;
  }
}