class Solution {
    public int[] asteroidCollision(int[] amk) {
         Stack<Integer> s = new Stack<Integer>();
        s.push(amk[0]);
        int temp=0;
        for(int i=1;i<amk.length;i++)
        {
            temp=amk[i];
            if(s.size()==0)
            {
                s.push(temp);
                continue;
            }
            if((temp>0&&s.peek()>0)||(temp<0&&s.peek()<0)||(temp>0&&s.peek()<0))
            {
                s.push(temp);
            }
            else
            {
                while(temp<0&&s.peek()>0)
                {
                    if(Math.abs(temp)>Math.abs(s.peek()))
                    {
                        s.pop();
                    }
                    else if(Math.abs(temp)==Math.abs(s.peek()))
                    {
                        s.pop();
                        temp=0;
                        break;
                    }
                    else
                    {
                        temp=0;
                        break;
                    }
                    if(s.size()==0)
                    {
                        break;
                    }
                }
                if(temp!=0)
                s.push(temp);
            }
        }
        int ans[]=new int[s.size()];
        
        for(int i=s.size()-1;i>=0;i--)
        {
            ans[i]=s.pop();
        }
        return ans;
    }
}