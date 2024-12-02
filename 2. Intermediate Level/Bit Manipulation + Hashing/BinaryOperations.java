public class BinaryOperations {
    public static void main(String[] args) {
        System.out.println(5 & 6); // Binary AND
        System.out.println(5 | 6); // Binary OR
        System.out.println(5 ^ 6); // Binary XOR --> Different bits XOR = 1
        System.out.println(~5); // Binary 1's Complement --> (-2)
        System.out.println(5 << 2);// Binary Left Shift (a << b = a * 2^b-->2 ki power b)
        System.out.println(6 >> 1);// Binary Right Shift (a >> b = a/2^b)
    }
}
