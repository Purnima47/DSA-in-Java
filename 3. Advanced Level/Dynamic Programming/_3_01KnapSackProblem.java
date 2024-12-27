public class _3_01KnapSackProblem {

    public static int knapSackUsingRecursion(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            // Case - 1 : Include
            int ans1 = val[n - 1] + knapSackUsingRecursion(val, wt, W - wt[n - 1], n - 1);

            // Case - 2 : Exclude
            int ans2 = knapSackUsingRecursion(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        } else {
            // Exclude
            return knapSackUsingRecursion(val, wt, W, n - 1);
        }
    }

    public static int knapSackUsingMemoization(int val[], int wt[], int W, int n, int dp[][]) {
        // T.C -> O(n * W)

        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // Case - 1 : Include
            int ans1 = val[n - 1] + knapSackUsingMemoization(val, wt, W - wt[n - 1], n - 1, dp);

            // Case - 2 : Exclude
            int ans2 = knapSackUsingMemoization(val, wt, W, n - 1, dp);

            return dp[n][W] = Math.max(ans1, ans2);
        } else {
            // Exclude
            return dp[n][W] = knapSackUsingMemoization(val, wt, W, n - 1, dp);
        }
    }

    public static int knapSackUsingTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int value = val[i - 1];
                int weight = wt[i - 1];

                if (weight <= j) {
                    int includeProfit = value + dp[i - 1][j - weight];
                    int exculdeProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(includeProfit, exculdeProfit);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];

    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int n = val.length;
        // System.out.println(knapSackUsingRecursion(val, wt, W, n));

        // W, n --> varies
        // We will make a 2D array of (n + 1) * (W + 1) size.
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        // System.out.println(knapSackUsingMemoization(val, wt, W, n, dp));

        System.out.println(knapSackUsingTabulation(val, wt, W));
    }
}
