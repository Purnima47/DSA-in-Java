public class GetIthBit {
    // To get ith bit we need to left shift 1 to ith place and take AND.
    // If it is 1 --> then ith bit is 1 vice-versa.
    public static int getBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(getBit(15, 4));
    }
}
