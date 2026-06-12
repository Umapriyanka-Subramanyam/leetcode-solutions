class Solution {
    public int scoreOfString(String s) {
        int ans=0;
	    for(int i=0;i<s.length()-1;i++){
	        int first=i;
	        int last=i+1;
	        char ch1=s.charAt(first);
	        char ch2=s.charAt(last);
	        int ascii1=ch1;
	        int ascii2=ch2;
	        int temp=(Math.abs(ascii1-ascii2));
	        ans=ans+temp;
	    }
	    return(ans);
        
    }
}