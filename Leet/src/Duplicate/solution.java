package Duplicate;

class Solution{

    public int removeDuplicated(int[] nums){

        if (nums.length == 0) return 0;

        int slow=0;
        
        int fast=1;

        for(; fast<nums.length; fast++){
            if(nums[fast]!= nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }







    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 2, 3, 3, 4};
        
        System.out.println(s.removeDuplicated(nums));
        
    }
}