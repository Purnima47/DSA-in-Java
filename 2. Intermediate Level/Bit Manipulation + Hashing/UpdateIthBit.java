public class UpdateIthBit {
    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void setithBit(int n, int i) {
        int bitMask = 1 << i;
        System.out.println(n | bitMask);
    }

    // M - 1
    public static void updateithBit1(int n, int i, int newBit) {
        n = clearithBit(n, i);
        int bitMask = newBit << i;
        System.out.println(n | bitMask);
    }

    // M - 2
    public static void updateithBit2(int n, int i, int newBit) {
        if (newBit == 0) {
            // clear ith bit
            System.out.println(clearithBit(n, i));
        } else {
            // set ith bit
            setithBit(n, i);
        }
    }

    public static void main(String[] args) {
        updateithBit1(8, 3, 1);
        updateithBit2(15, 1, 1);
    }
}
