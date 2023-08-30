class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        list.add(1);
        ans.add(new ArrayList(list));
        for(int i=2;i<=numRows;i++)
        {
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i-1;j++)
            {
                temp.add(ans.get(ans.size()-1).get(j-1)+ans.get(ans.size()-1).get(j));
            }
            temp.add(1);
            ans.add(new ArrayList(temp));
        }
        return ans;
    }
}