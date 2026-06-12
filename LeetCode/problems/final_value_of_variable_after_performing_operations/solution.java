class Solution {
    public int finalValueAfterOperations(String[] str) {
        int ans=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("++X")||str[i].equals("X++")){
                ans=ans+1;
            }
            else{
                ans=ans-1;
            }
        }
        return ans;
    }
}