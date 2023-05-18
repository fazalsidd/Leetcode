class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int arr[]=new int[n];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<edges.size();i++)
        {
            arr[edges.get(i).get(1)]++;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}