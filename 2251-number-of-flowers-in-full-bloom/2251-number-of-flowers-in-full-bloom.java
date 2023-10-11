class Solution {
    public int[] fullBloomFlowers(int[][] f, int[] p) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int ans[]=new int[p.length];
        int temp[][]=new int[p.length][2];
        for(int i=0;i<p.length;i++)
        {
            temp[i][0]=p[i];
            temp[i][1]=i;
        }
         Arrays.sort(temp, (a, b) -> Integer.compare(a[0],b[0]));
         Arrays.sort(f, (a, b) -> Integer.compare(a[0],b[0]));
        int k=0;
        for(int i=0;i<p.length;i++)
        {
            while(k<f.length&&f[k][0]<=temp[i][0])
            {
                pq.add(f[k][1]);
                k++;
            }
            while(!pq.isEmpty()&&pq.peek()<temp[i][0])
            {
                pq.remove();
            }
            ans[temp[i][1]]=pq.size();
        }
        return ans;
    }
}