class Solution {
    public boolean winnerOfGame(String colors) {
        int B=0;
        int A=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A'){
                if(colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                    A++;
                }
            }else{
                if(colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                    B++;
                }
            }
        }
        return A>B?true:false;
    }
}