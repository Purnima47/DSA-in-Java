public class XToPowerN {
    public static int xtoPowern(int x, int n) {
        if (n == 0)
            return 1;

        int halfPow = xtoPowern(x, n / 2);
        int halfPowSq = halfPow * halfPow;

        // n is odd
        if (x % n != 0)
            halfPowSq *= x;

        return halfPowSq;
    } 

    public static void main(String[] args) {
        xtoPowern(10, 5);
    }
}
