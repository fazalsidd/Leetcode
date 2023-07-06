class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        String temp[]=new String[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            char tempArray[] = strs[i].toCharArray();
           Arrays.sort(tempArray);
            temp[i]=new String(tempArray);
        }
        for(int i=0;i<strs.length;i++)
        {
            String s=temp[i];
            if(!map.containsKey(s))
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(strs[i]);
                for(int j=i+1;j<strs.length;j++)
                {
                     String k=temp[j];
                    if(s.equals(k))
                    {
                        list.add(strs[j]);
                    }
                }
                map.put(s,i);
                ans.add(list);
            }
        }
        return ans;
    }
}