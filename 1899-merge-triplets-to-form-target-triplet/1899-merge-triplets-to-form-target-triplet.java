class Solution {
    public boolean mergeTriplets(int[][] triplet, int[] target) {
        int [] ans=new int[3];
        for(int i=0;i<triplet.length;i++)
        {
            if(triplet[i][0]<=target[0]&&triplet[i][1]<=target[1]&&triplet[i][2]<=target[2])
            {
                ans[0]=Math.max(triplet[i][0],ans[0]);
                ans[1]=Math.max(triplet[i][1],ans[1]);
                ans[2]=Math.max(triplet[i][2],ans[2]);
            }
        }
        if(target[0]==ans[0]&&target[1]==ans[1]&&target[2]==ans[2])
            return true;
        
        return false;
    }
}