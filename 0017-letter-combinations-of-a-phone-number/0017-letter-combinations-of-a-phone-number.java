class Solution {
    String key[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> ans=new ArrayList<>();
    public void helper(String dig,int i,String s)
    {
        if(i>=dig.length())
        {
            ans.add(s);
            return;
        }
        int k=Integer.parseInt(dig.charAt(i)+"");
        String temp=key[k];
        for(int j=0;j<temp.length();j++)
        {
            String t=s+temp.charAt(j);
            helper(dig,i+1,t);
        }
    }
    public List<String> letterCombinations(String dig) {
        if(dig.equals(""))
            return ans;
        helper(dig,0,"");
        return ans;
    }
}