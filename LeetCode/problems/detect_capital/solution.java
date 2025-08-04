class Solution {
    public boolean detectCapitalUse(String word) {
     char a[]=word.toCharArray();
     int c=0;
     for(int i:a)
     {
        if(Character.isUpperCase(i))
        {
            c++;
        }    
     }      
     return c==a.length || c==0 || (c==1 && Character.isUpperCase(a[0]));
  }
}