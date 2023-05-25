class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k==0) return 1.0;
        if(n>=k-1+maxPts) return 1.0;
        double[] arr = new double[n+1];
        Arrays.fill(arr,0.0);
        double prob = 0.0,sum=1.0;
        arr[0] = 1.0;
        for(int i=1;i<=n;i++){
            arr[i] = sum/maxPts;
            if(i<k) sum+=arr[i];
            else prob+=arr[i];
            if(i>=maxPts) sum-=arr[i-maxPts];
        }
        return prob;
    }
}