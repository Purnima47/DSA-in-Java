public class SetIthBit {
    // We have to set ith bit to 1. This means we have to use OR operator.
    public static void setithBit(int n, int i) {
        int bitMask = 1 << i;
        System.out.println(n | bitMask);
    }

    public static void main(String[] args) {
        setithBit(10, 2);
    }
}
