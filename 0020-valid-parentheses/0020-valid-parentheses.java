class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!stack.empty())
            {
               char k=stack.peek();
               if(k=='('&&c==')')
               stack.pop();
               else if(k=='['&&c==']')
               stack.pop();
               else if(k=='{'&&c=='}')
               stack.pop();
               else
               stack.push(c);
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}