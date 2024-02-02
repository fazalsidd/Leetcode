class Solution {
    ArrayList<List<Integer>> ans=new ArrayList<>();
    public void helper(ArrayList<Integer> list,int k,int n,int i)
    {
        if(n<0)
            return;
        if(k==0)
        {
            if(n==0)
                ans.add(new ArrayList(list));
            return;
        }
        for(int j=i;j<=9;j++)
        {
            list.add(j);
            helper(list,k-1,n-j,j+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(list,k,n,1);
        return ans;
    }
}