class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
          String str=sentences[i];
          int temp=1;
          for(int j=0;j<str.length();j++){
            if(str.charAt(j)==' '){
                temp++;  
            } 
          }
          ans=Math.max(ans,temp);
        }
        return ans; 
    }
}