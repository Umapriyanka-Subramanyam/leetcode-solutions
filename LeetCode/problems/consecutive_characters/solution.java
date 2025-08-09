class Solution {
    public int maxPower(String s) {
        
        if(s.length()==1)
            return 1;

        int maximum = Integer.MIN_VALUE;
        int count = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            maximum = Math.max(maximum,count);
        }

        return maximum;
    }
}