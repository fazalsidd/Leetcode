class Solution {
    public int findmax(int arr1[],int p){
        int s=0;
        int e=arr1.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr1[mid]<=p){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans+1;
    }
    public int findright(int arr1[],int p){
        int s=0;
        int e=arr1.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr1[mid]<p){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans+1;
    }
   
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n=flowers.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=flowers[i][0];
            arr2[i]=flowers[i][1];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ans[]=new int[people.length];
        for(int i=0;i<people.length;i++){
            int p=people[i];
            int chk1=findmax(arr1,p);
            int chk2=findright(arr2,p);
            ans[i]=chk1-chk2;

        }
        return ans;
    }
}