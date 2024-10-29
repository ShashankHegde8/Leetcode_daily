class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Array to store the number of ways to reach each step
        int[] dp = new int[n + 1];
        dp[1] = 1; // 1 way to climb 1 step
        dp[2] = 2; // 2 ways to climb 2 steps

        // Fill the dp array
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // The number of ways to reach the top (step n)
        return dp[n];
    }
}