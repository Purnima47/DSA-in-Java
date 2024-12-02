public class ClearIthBit {
    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }
    public static void main(String[] args) {
        System.out.println(clearithBit(3, 1));
    }
}
