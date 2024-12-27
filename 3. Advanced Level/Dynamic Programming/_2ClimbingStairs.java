public class _2ClimbingStairs {
    // Count ways to reach the nth stair. The person can climb either 1 stair or 2
    // stairs at a time.

    public static int csByRecursion(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return csByRecursion(n - 1) + csByRecursion(n - 2);
    }

    public static int csByMemoization(int n, int dp[]) {
        if (n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return dp[n] = 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = csByMemoization(n - 1, dp) + csByMemoization(n - 2, dp);
    }

    public static int csByTabulation(int n, int dp[]) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int dp[] = new int[n + 1];

        csByMemoization(n, dp);
        csByTabulation(n, dp);
    }
}
