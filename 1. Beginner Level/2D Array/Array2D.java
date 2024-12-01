import java.io.*;

public class Array2D {
    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Sum of principal and secondary diagonal is:" + DiagonalSum(matrix));
    }
}
