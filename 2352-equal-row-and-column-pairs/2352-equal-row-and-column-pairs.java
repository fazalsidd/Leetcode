class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map=new HashMap<>();
        String s="";
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                s=s+grid[i][j]+".";
            }
            if(map.containsKey(s))
            {
                map.put(s,map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
            s="";
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                s=s+grid[j][i]+".";
            }
            if(map.containsKey(s))
            {
                ans+=map.get(s);
            }
            s="";
        }
        return ans;
    }
}