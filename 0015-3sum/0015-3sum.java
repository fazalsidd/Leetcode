class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans=new ArrayList<>();
        HashMap<String,Integer> occ=new HashMap<>();
        int l=1;
        int r=nums.length-1;
        while(l<r)
        {
            if(nums[l]+nums[r]+nums[0]<0)
            {
                l++;
            }
             else if(nums[l]+nums[r]+nums[0]>0)
            {
                r--;
            }
            else
            {
                String s=nums[0]+"."+nums[l]+"";
                if(!occ.containsKey(s))
                {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(nums[0]);
                list.add(nums[l]);
                list.add(nums[r]);
                occ.put(s,0);
                ans.add(list);
                }
                l++;
                r--;
            }
        }
        for(int i=1;i<nums.length-2;i++)
        {
            if(nums[i]!=nums[i-1])
            {
            l=i+1;
            r=nums.length-1;
        while(l<r)
        {
            if(nums[l]+nums[r]+nums[i]<0)
            {
                l++;
            }
             else if(nums[l]+nums[r]+nums[i]>0)
            {
                r--;
            }
            else
            {
                 String s=nums[i]+"."+nums[l]+"";
                if(!occ.containsKey(s))
                {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[l]);
                list.add(nums[r]);
                occ.put(s,i);
                ans.add(list);
                }
                l++;
                r--;
            }
        }
            }
        }
        return ans;
    }
}