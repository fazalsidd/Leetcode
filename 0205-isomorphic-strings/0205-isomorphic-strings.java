class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[128]; 
        int[] map2 = new int[128]; 

        for(int i=0; i<s.length(); i++) {
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);

            if(map1[s_ch]==0 && map2[t_ch]==0) {
                map1[s_ch] = t_ch;
                map2[t_ch] = s_ch;
            }
            else if(map1[s_ch] != t_ch || map2[t_ch] != s_ch) {
                return false;
            }
        }
        return true;
    }
}