package RemoveDuplicates;
import java.util.Arrays; // Add missing import statement

class Solution {
    public   int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return nums;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        int[] result = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            result[k] = nums[k];
        }
        return result;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(s.removeDuplicates(nums)));
    }
}

// Output: [0, 1, 2, 3, 4]