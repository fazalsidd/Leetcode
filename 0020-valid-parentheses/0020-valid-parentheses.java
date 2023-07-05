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
}