class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            p.add(stones[i]);
        }
        while(p.size()>1)
        {
            int y=p.poll();
            int x=p.poll();
            if(x==y)
                p.add(0);
            else
            p.add(y-x);
        }
        return p.poll();
    }
}