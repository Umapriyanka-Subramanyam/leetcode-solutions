class Solution {
    public String reverseWords(String s) {
        s.trim();
        String str[]=s.split("\\s+");
        String str2=" ";
        for(int i=str.length-1;i>=0;i--)
        {
            str2=str2+str[i]+" ";
        }
        return str2.trim();     
    }
}