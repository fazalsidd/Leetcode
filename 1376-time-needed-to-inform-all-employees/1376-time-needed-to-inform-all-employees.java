class Solution {
    public int helper(int i,List<List<Integer>> employees, int[] in)
    {
        int ans=0;
        for(int j:employees.get(i))
        {
            ans=Math.max(ans,in[i]+helper(j,employees,in));
        }
        return ans;
    }
    public int numOfMinutes(int n, int h, int[] m, int[] in) {
        List<List<Integer>> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            employees.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (m[i] != -1) {
                employees.get(m[i]).add(i);
            }
        }
        return helper(h,employees,in);
    }
}