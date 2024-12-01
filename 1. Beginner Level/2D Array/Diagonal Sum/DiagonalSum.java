// Leetcode Ques --> 1572 (Easy)
public class DiagonalSum {
    // Primary Diagonal --> i == j
    // Secondary Diagonal ---> i + j = n - 1
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // PD
            sum += matrix[i][i];

            // SD
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        System.out.println(sum);
    }
}
