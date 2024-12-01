import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchIn2DArr {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;
        System.out.println("Enter your elements");
        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // Output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
