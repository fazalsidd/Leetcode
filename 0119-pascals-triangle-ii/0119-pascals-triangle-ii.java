class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> list=new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        list.add(1);
        //System.out.print(list);
        lists.add(list);
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer> temp=new ArrayList<>();;
            int j=0;
            while(j<=i)
            {
                if(j==0)
                {
                    temp.add(1);
                }
                else if(j==lists.get(i-1).size())
                {
                    temp.add(1);
                }
                else
                {
                   // System.out.print(data);
                    temp.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }
                j++;
            }
           // System.out.print(list);
            lists.add(temp);
            //System.out.print(list);
        }
        //System.out.print(lists);
        return lists.get(rowIndex);
    }
}