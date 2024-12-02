public class OddEvenInBit {
    public static void oddEven(int n) {
        // LSB of ODD number is always 1.
        // LSB of EVEN number is always 0.
        // AND --> Both 1 --> 1
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even no.");
        } else {
            System.out.println("Odd no.");
        }
    }

    public static void main(String[] args) {
        oddEven(6);
    }
}
