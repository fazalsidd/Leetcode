class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer> list=new ArrayList<>();
        int rt=0;
        int rb=m.length-1;
        int cl=0;
        int cr=m[0].length-1;
        int count =0;
        while(count<(m.length)*(m[0].length))
        {
            for(int i=cl;i<=cr;i++)
            {
                list.add(m[rt][i]);
                count++;
            }
            rt++;
            if(count==(m.length)*(m[0].length))
                break;
            for(int i=rt;i<=rb;i++)
            {
                list.add(m[i][cr]);
                count++;
            }
            cr--;
            if(count==(m.length)*(m[0].length))
                break;
            for(int i=cr;i>=cl;i--)
            {
                list.add(m[rb][i]);
                count++;
            }
            rb--;
            if(count==(m.length)*(m[0].length))
                break;
            for(int i=rb;i>=rt;i--)
            {
                list.add(m[i][cl]);
                count++;
            }
            cl++;
        }
        return list;
    }
}