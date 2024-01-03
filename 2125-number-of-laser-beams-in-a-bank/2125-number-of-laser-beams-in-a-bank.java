class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int first=0;
        int second=0;
        int i=0;
        int j=0;
        for(i=0;i<bank.length;i++)
        {
            for(j=0;j<bank[i].length();j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    first++;
                }
            }
            if(first>0)
            {
                break;
            }
        }
         for(i=i+1;i<bank.length;i++)
        {
            for(j=0;j<bank[i].length();j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    second++;
                }
            }
             if(second!=0)
             {
             ans+=first*second;
                 first=second;
                 second=0;
             }
        }
        return ans;
    }
}