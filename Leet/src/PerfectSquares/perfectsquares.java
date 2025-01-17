package PerfectSquares;

//Given an integer n, return the least number of perfect square numbers that sum to n.
//A perfect square is an integer that is 
//the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.


class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 12;
        System.out.println(s.numSquares(n));

    }
}