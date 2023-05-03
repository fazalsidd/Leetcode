class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
         ArrayList<Integer> l2=new ArrayList<>();
        HashMap<Integer,Integer> m1=new HashMap<>();
        HashMap<Integer,Integer> m2=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!m1.containsKey(nums1[i]))
                m1.put(nums1[i],i);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(!m2.containsKey(nums2[i]))
                m2.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(!m2.containsKey(nums1[i])&&!l1.contains(nums1[i]))
                l1.add(nums1[i]);
        }
        ans.add(l1);
        for(int i=0;i<nums2.length;i++)
        {
            if(!m1.containsKey(nums2[i])&&!l2.contains(nums2[i]))
               l2.add(nums2[i]);
        }
        ans.add(l2);
        return ans;
    }
}