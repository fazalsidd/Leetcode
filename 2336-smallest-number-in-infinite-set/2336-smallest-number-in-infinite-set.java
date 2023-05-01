class SmallestInfiniteSet {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
      HashMap<Integer,Integer> map=new HashMap<>();
    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++)
        {
        q.add(i);
        map.put(i,i);
        }
    }
    
    public int popSmallest() {
        map.remove(q.peek());
        int ans=q.poll();
         return ans;
    }
    
    public void addBack(int num) {
        if(!map.containsKey(num))
        {
        q.add(num);
        map.put(num,num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */