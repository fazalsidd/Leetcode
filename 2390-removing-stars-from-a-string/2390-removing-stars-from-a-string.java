class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='*')
            {
                stack.pop();
            }
            else
            {
               stack.push(s.charAt(i)); 
            }
            i++;
        }
        String ans="";
        while(!stack.isEmpty())
        {
            ans=stack.pop()+ans;
        }
        return ans;
    }
}