class Solution 
{
    public String defangIPaddr(String str) 
    {
      String ans="";
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='.'){
            ans=ans+"[.]" ;
        }
        else{
            ans=ans+ch;
        }

       }
       return ans;
    }
}