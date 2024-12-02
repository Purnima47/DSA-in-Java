public class ClearIBits {
    public static void clearIbits(int n, int i) {
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }

    public static void main(String[] args) {
        clearIbits(7, 1);
    }
}
