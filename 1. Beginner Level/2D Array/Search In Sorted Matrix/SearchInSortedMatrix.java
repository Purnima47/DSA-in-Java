// Ques No. 74 and 240 (Leetcode)
public class SearchInSortedMatrix {
    // T.C. -> O(n + m)
    public static boolean stairCase(int matrix[][], int key) {
        int row = 0, column = matrix[0].length - 1;
        // matrix[0][lastCol] --> start

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("Key Found at (" + row + "," + column + ")");
                return true;
            } else if (key < matrix[row][column]) {
                // move to left
                column--;
            } else {
                // move to bottom
                row++;
            }
        }

        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 },
                { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;
        System.out.println(stairCase(matrix, key));
    }
}
