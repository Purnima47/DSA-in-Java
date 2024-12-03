public class BinaryStringProblem {
    // Ques --> Print all binary strings of size N without consecutive 1's.
    public static void binaryString(String str, int n, int last) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryString(str + "0", n - 1, 0);

        if (last == 0) {
            binaryString(str + "1", n - 1, 1);
        }
    }

    public static void main(String[] args) {
        binaryString("", 4, 0);
    }
}