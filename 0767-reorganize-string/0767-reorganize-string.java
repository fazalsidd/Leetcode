class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        Queue<Character> pq=new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        for(char word : map.keySet()){
            pq.offer(word);
        }
        char[] ch=new char[s.length()];
        int i=0;
        char ptr=0;

        while(!pq.isEmpty()){
            char word=pq.poll();
            int freq=map.get(word)-1;
            map.put(word,freq);
            ch[i++]=word;
            if(ptr!=0)pq.offer(ptr);
            if(freq>0) ptr=word;
            else ptr=0;
        }
        if(ptr != 0) {
            return "";
        }
        
        return new String(ch);
    }
}