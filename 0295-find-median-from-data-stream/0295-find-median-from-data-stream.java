class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        
        int start =0 , end= list.size(), mid;
        while(start<end){
            mid = (start+end)/2;
            if(num < list.get(mid))
                end = mid;
            else 
                start = mid+1;
        }
        
        list.add(start, num);
    }
    
    public double findMedian() {
        int size = list.size();
        double median=0;
        if(size% 2 == 0){
            median = (list.get(size/2) + list.get(size/2 -1)) / 2.0;
        }else{
            median = list.get(size/2);
            
        }
        
        return median;
    }
}