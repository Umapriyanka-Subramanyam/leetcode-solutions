class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int k=0;
        for(int num:nums) if(num != val) nums[k++]=num;
        return k;
    }       
    
    public static void main(String[] args){
        Solution s=new Solution();
        int[] nums = {3,2,2,3};
        int k=s.removeElement(nums,3);
        System.out.println(k);
    }
    
}