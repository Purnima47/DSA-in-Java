public class ClearLastIBits {
    public static void clearIbits(int n, int i) {
        // ~0 = -1 = 11111111 (all 1's)
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }

    public static void main(String[] args) {
        clearIbits(7, 1);
    }
}
