class Solution {
    public boolean check(char[][]s,int i,int j)
    {
        int m=i;
        int n=j;
        while(m>=0)
        {
            if(s[m][n]=='Q')
                return false;
            m--;
        }
        m=i;
        while(m>=0&&n>=0)
        {
            if(s[m][n]=='Q')
                return false;
            m--;
            n--;
        }
        m=i;
        n=j;
        while(m>=0&&n<s.length)
        {
            if(s[m][n]=='Q')
                return false;
            m--;
            n++;
        }
        return true;
    }
    public void helper(List<List<String>> ans,char[][]s,int n,int i)
    {
        if(i==n)
        {
            List<String> list=new ArrayList<>();
            String str="";
            for(int p=0;p<n;p++)
            {
                for(int q=0;q<n;q++)
                {
                    str+=s[p][q]+"";
                }
                list.add(str);
                str="";
            }
            ans.add(new ArrayList(list));
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(check(s,i,j))
            {
                s[i][j]='Q';
            helper(ans,s,n,i+1);
                s[i][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][]s=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                s[i][j]='.';
            }
        }
        helper(ans,s,n,0);
        return ans;
    }
}