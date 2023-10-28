class Solution {
    public int countVowelPermutation(int n) {
        long arr[][]=new long[5][n];
        int index=0;
        long mod=1000000007;
        for(int i=0;i<5;i++)
        {
            if(index>=n)
            {
                break;
            }
            if(index==0)
            {
                arr[i][index]=1;
            }
            else 
            {
                if(i==0)
                {
                    arr[i][index]=(arr[2][index-1]+arr[1][index-1]+arr[4][index-1])%mod;
                }
                else if(i==1)
                {
                    arr[i][index]=(arr[0][index-1]+arr[2][index-1])%mod;
                }
                else if(i==2)
                {
                    arr[i][index]=(arr[1][index-1]+arr[3][index-1])%mod;
                }
                else if(i==3)
                {
                    arr[i][index]=arr[2][index-1];
                }
                else if(i==4)
                {
                    arr[i][index]=(arr[2][index-1]+arr[3][index-1])%mod;
                }
            }
            if(i==4)
            {
                index++;
                i=-1;
            }
        }
        long sum=0;
        for(int i=0;i<5;i++)
        {
           sum=  (sum+arr[i][n-1]);
        }
        return (int)(sum%mod);

    }
}