class MyHashMap {
    ArrayList<Integer> k=new ArrayList<>();
    ArrayList<Integer> v=new ArrayList<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if(k.contains(key))
        {
            int i=k.indexOf(key);
            k.set(i,key);
            v.set(i,value);
        }
        else
        {
            k.add(key);
            v.add(value);
        }
    }
    
    public int get(int key) {
        if(!k.contains(key))
        {
            return -1;
        }
        else{
            int i=k.indexOf(key);
            return v.get(i);
        }
    }
    
    public void remove(int key) {
        if(k.contains(key))
        {
            int i=k.indexOf(key);
            k.remove(i);
            v.remove(i);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */