package RemoveElement;

import java.util.Arrays;




class Solution {
    public int[] removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0) return nums;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; 
                i++; 
            }
        }
        //in the final of this loop, i will be the length of the new array and nums[i] will be all the elements that are not equal to val.
       


        int[] result = new int[i];
        for (int k = 0; k < i; k++) {
            result[k] = nums[k];
        }
        return result;



    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(Arrays.toString(s.removeElement(nums, val)));
    }
}

    
  
   