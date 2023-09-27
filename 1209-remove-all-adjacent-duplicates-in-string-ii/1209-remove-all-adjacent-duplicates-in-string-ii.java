class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character,Integer>> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.add(new Pair(s.charAt(i),1));
            }
            else
            {
                Pair<Character,Integer> p=st.peek();
                if(p.getKey()==s.charAt(i))
                {
                    st.pop();
                    st.push(new Pair(s.charAt(i),p.getValue()+1));
                }
                else
                {
                    st.add(new Pair(s.charAt(i),1));
                }
            }
            if(st.peek().getValue()==k)
                st.pop();
        }
        while(!st.isEmpty())
        {
            Pair<Character,Integer> q=st.pop();
            for(int i=0;i<q.getValue();i++)
            {
                ans=q.getKey()+ans;
            }
        }
        
        return ans;
    }
}