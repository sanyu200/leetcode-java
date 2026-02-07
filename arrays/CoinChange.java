// Problem: Coin Change (LeetCode)
// Pattern: Dynamic Programming (Unbounded Knapsack)
// Time Complexity: O(n × amount)
// Space Complexity: O(n × amount)

class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        // Base Case: 0 coins needed to make amount 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // Base Case: Impossible to make amount > 0 with 0 coin types
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1;
        }

     
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {

                // If current coin can be used
                if (coins[i - 1] <= j) {
                    // Include coin (unlimited use) or exclude it
                    dp[i][j] = Math.min(
                        1 + dp[i][j - coins[i - 1]],
                        dp[i - 1][j]
                    );
                } 
                // If coin value is greater than current amount
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int result = dp[n][amount];
        return result >= Integer.MAX_VALUE - 1 ? -1 : result;
    }
}
