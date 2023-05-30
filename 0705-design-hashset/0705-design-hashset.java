class MyHashSet {
    boolean[] st;

    public MyHashSet() {
        st = new boolean[1000000 + 1];
    }
    
    public void add(int key) {
        st[key] = true;
    }
    
    public void remove(int key) {
        st[key] = false;
    }
    
    public boolean contains(int key) {
        return st[key];
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */