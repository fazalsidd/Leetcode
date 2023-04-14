class Solution {
    // int tra=0;
    // public boolean helper(int[] pu, int[] po,int l,int r)
    // {
    //     if(l>r)
    //     {
    //         return true;
    //     }
    //     boolean ans1=true;
    //     for(int i=l;i<=r;i++)
    //     {
    //         if(po[tra]==pu[i])
    //         {
    //             tra++;
    //             if(tra==po.length)
    //     return true;
    //             if(i!=0&&i!=po.length-1)
    //             {
    //             if(po[tra]==pu[i-1])
    //             ans1=helper(pu,po,l,i-1);
    //             else if(po[tra]==pu[i+1])
    //             ans1=helper(pu,po,i+1,r);
    //             else
    //             return false;
    //             }
    //             else if(i==0)
    //             {
    //             if(po[tra]==pu[i+1])
    //             ans1=helper(pu,po,i+1,r);
    //             else
    //             return false;
    //             }
    //              else
    //             {
    //             if(po[tra]==pu[i-1])
    //             ans1=helper(pu,po,l,i-1);
    //             else
    //             return false;
    //             }
    //             break;
    //         }
    //         if(i==r)
    //             return false;
    //     }
    //     return ans1;
    // }
    public boolean validateStackSequences(int[] pu, int[] po) {
        Stack<Integer> stack = new Stack<Integer>();
        int in=0;
        int i=0;
        while(i<pu.length)
        {
            stack.push(pu[i]);
            int flag=0;
            while(flag==0)
            {
                if(!stack.isEmpty())
                {
                    if(stack.peek()==po[in])
                    {
                        stack.pop();
                        in++;
                    }
                    else
                    {
                        flag=1;
                    }
                }
                else
                {
                    flag=1;
                }
            }
            i++;
        }

        return stack.isEmpty();
    }
}