class Solution {
    public boolean isNStraightHand(int[] hand, int gr) {
        if(hand.length%gr!=0)
            return false;
        if(gr==1)
            return true;
        Arrays.sort(hand);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i :hand)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
           else
           {
            map.put(i,1);
           }
        }
        for(int i :hand)
        {
            if(map.get(i)<=0)
                continue;
            
            map.put(i,map.get(i)-1);
            for(int j=1;j<gr;j++)
            {
                if(!map.containsKey(i+j))
                    return false;
                else if(map.get(i+j)<=0)
                    return false;
                else
                    map.put(i+j,map.get(i+j)-1);
            }
        }
        return true;
    }
}