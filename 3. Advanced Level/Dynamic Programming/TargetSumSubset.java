public class TargetSumSubset {
    public static void targetSumSubsetUsingTabulation(int numbers[], int sum) {
        int n = numbers.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 2, 7, 1, 3 };
        int targetSum = 10;
        targetSumSubsetUsingTabulation(numbers, targetSum);
    }
}
