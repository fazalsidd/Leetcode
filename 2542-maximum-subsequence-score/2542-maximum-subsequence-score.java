class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int mat[][]=new int[nums1.length][2];
         PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        long ans=-1;
        long pre=0;
        for(int i=0;i<nums1.length;i++)
        {
            mat[i][0]=nums1[i];
            mat[i][1]=nums2[i];
        }
        Arrays.sort(mat,(a,b)->b[1]-a[1]);
        for(int i=0;i<k;i++)
        {
            pre+=mat[i][0];
            pq.add(mat[i][0]);
        }
        ans=pre*mat[k-1][1];
        for(int i=k;i<nums1.length;i++)
        {
            pre+=mat[i][0]-pq.poll();
            pq.add(mat[i][0]);
           
            ans=Math.max(ans,pre*mat[i][1]);
        }
        return ans;
    }
}