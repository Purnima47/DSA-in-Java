public class TargetSumSubset {
    public static boolean targetSumSubsetUsingTabulation(int numbers[], int sum) {
        // O(n * sum) --> T.C

        int n = numbers.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        // i --> items , j --> target sum
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int value = numbers[i - 1];

                // include
                if (value <= j && dp[i - 1][j - value] == true) {
                    dp[i][j] = true;
                }

                // exclude
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 2, 7, 1, 3 };
        int targetSum = 10;
        System.out.println(targetSumSubsetUsingTabulation(numbers, targetSum));
    }
}
