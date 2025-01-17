
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SquaresTest {

    @Test
    void testSquares_of_sorted_arrays() {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] expected1 = {0, 1, 9, 16, 100};
        assertArrayEquals(expected1, solution.Squares_of_sorted_arrays(nums1));

        // Test case 2
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] expected2 = {4, 9, 9, 49, 121};
        assertArrayEquals(expected2, solution.Squares_of_sorted_arrays(nums2));

        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 4, 9, 16, 25};
        assertArrayEquals(expected3, solution.Squares_of_sorted_arrays(nums3));

        // Test case 4
        int[] nums4 = {-5, -4, -3, -2, -1};
        int[] expected4 = {1, 4, 9, 16, 25};
        assertArrayEquals(expected4, solution.Squares_of_sorted_arrays(nums4));

        // Test case 5
        int[] nums5 = {0};
        int[] expected5 = {0};
        assertArrayEquals(expected5, solution.Squares_of_sorted_arrays(nums5));
    }
    
}