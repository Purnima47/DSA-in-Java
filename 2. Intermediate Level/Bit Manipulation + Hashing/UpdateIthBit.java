public class UpdateIthBit {
    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void updateithBit(int n, int i, int newBit) {
        n = clearithBit(n, i);
        int bitMask = newBit << i;
        System.out.println(n | bitMask);
    }

    public static void main(String[] args) {
        updateithBit(8, 3, 1);
    }
}
