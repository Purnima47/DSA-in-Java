package Exponentiation;

public class Exponential {
    public static void main(String[] args) {
        int a = 2, n = 5;
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // if LSB is 1..
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }
        System.out.println(ans);
    }
}
