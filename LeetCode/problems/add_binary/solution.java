class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int flag=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0||flag==1){
            if(i>=0)
              flag += a.charAt(i--) -'0';
            if(j>=0)
              flag += b.charAt(j--) -'0';
            s.append(flag%2);
            flag/=2; 
        }
        return s.reverse().toString();
    }
}