class Solution {
    public static String[] keypad={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     ArrayList<String> ans = new ArrayList<String>();
    public static void xxx(String digits,int idx,String combination,List<String> ans) 
    {
        if(idx==digits.length())
        {
            ans.add(combination);
            return;
        }
     char c=digits.charAt(idx);
        String mapping=keypad[c-'2'];
        for(int i=0;i<mapping.length();i++)
        {
            xxx(digits,idx+1,combination+mapping.charAt(i),ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        int idx=0;
        String combination="";
        if(digits.length()==0)
        {
            return ans;
        }
        xxx(digits,idx,combination,ans);
        return ans;
    }
}