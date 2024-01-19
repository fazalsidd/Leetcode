class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s=new Stack<>();
        int f=0;
        int ss=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i].equals("/"))
            {
                f=s.pop();
                ss=s.pop();
                s.push(ss/f);
            }
            else if(t[i].equals("*"))
            {
                f=s.pop();
                ss=s.pop();
                s.push(ss*f);
            }
            else if(t[i].equals("+"))
            {
                f=s.pop();
                ss=s.pop();
                s.push(ss+f);
            }
            else if(t[i].equals("-"))
            {
                f=s.pop();
                ss=s.pop();
                s.push(ss-f);
            }
            else
            {
                int temp=Integer.parseInt(t[i]);
                s.push(temp);
            }
        }
        return s.pop();
    }
}