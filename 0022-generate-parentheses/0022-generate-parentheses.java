class Solution {
    public boolean isValid(String k) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<k.length();i++)
        {
            char c=k.charAt(i);
            if(c==')')
            {
               if(s.isEmpty())
                   return false;
                if(s.peek()=='(')
                    s.pop();
                else
                    return false;
            }
            else if(c=='}')
            {
               if(s.isEmpty())
                   return false;
                if(s.peek()=='{')
                    s.pop();
                else
                    return false;
            }
            else if(c==']')
            {
                if(s.isEmpty())
                   return false;
                if(s.peek()=='[')
                    s.pop();
                else
                    return false;
            }
            else
            {
                s.push(c);
            }
        }
        return s.isEmpty();
    }
    public void helper(int n,ArrayList<String> ans,String str)
    {
        if(n==0)
        {
            if(isValid(str))
                ans.add(str);
            
            return;
        }
        String temp1=str+"(";
        helper(n-1,ans,temp1);
        String temp2=str+")";
        helper(n-1,ans,temp2);
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        helper(2*n,ans,"");
        return ans;
    }
}