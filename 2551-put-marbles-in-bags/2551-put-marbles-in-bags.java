class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k==1 || k==weights.length)
        {
            return 0;
        }
         List<Long> list1 = new ArrayList<>();
         List<Long> list2 = new ArrayList<>();

         for(int i=0;i<weights.length-1;i++)
         {
             list1.add((long)weights[i] + weights[i + 1]);
             list2.add((long)weights[i] + weights[i + 1]);
         }
         Collections.sort(list1);
         Collections.sort(list2, Collections.reverseOrder());
         long min_sum = 0,max_sum=0;
         for(int i=0;i<k-1;i++)
         {
             min_sum += list1.get(i);
             max_sum += list2.get(i);
         }
        
        return (max_sum - min_sum);
    } 
}