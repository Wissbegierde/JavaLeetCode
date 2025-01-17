

import java.util.Arrays;

class Solution {
    public int[] Squares_of_sorted_arrays(int[] nums){
            int left = 0;
            int right = nums.length-1;

            while(left<=right){
                nums[left] = (int) Math.pow(nums[left], 2);
                nums[right] = (int) Math.pow(nums[right], 2);
                left++;
                right--;
            }
            
        Arrays.sort(nums);


        return nums;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = s.Squares_of_sorted_arrays(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }


    }
}
