class Solution {
    Double[][] memo;
    public double soupServings(int n) {
        if(n>=4800) return 1.0;
        memo=new Double[n+1][n+1];
        return go(n,n);
    }
    private double go(int a, int b){
        if(a<=0 && b<=0) return 0.5;
        if(a<=0) return 1;
        if(b<=0) return 0;
        if(memo[a][b]!=null) return memo[a][b];
        return memo[a][b]=0.25*(go(a-100,b)+go(a-75,b-25)+go(a-50,b-50)+go(a-25,b-75));
    }
}