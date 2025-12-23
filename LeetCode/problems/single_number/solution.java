class Solution {
    public int singleNumber(int[] nums) {
        int flag=0;
        for(int n : nums){
            flag=flag^n;
        }
        return flag;
    }
}