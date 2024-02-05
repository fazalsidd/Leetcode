class Solution {
    public int firstUniqChar(String s) {
        Map<Integer,Character> x=new HashMap<>();
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            x.put(i,s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            x.remove(i);
            if(x.containsValue(s.charAt(i)))
            {
                 x.put(i,s.charAt(i));
            }
            else
            {
                index=i;
                break;
            }
        }
        return index;
    }
}