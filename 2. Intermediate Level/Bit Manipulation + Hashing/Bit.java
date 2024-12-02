
public class Bit {
    

    public static void Exponential(int a, int n) {
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

    public static void ModularExponential(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = a * a;
                n = n / 2;
            } else {
                ans = ans * a;
                n = n - 1;
            }
        }
        System.out.println(ans);
    }

    public static void UpperToLower() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
        System.out.println();
    }

    public static void LowerToUpper() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch & ('_')));
        }
        System.out.println();
    }

    public static void Add1toInt(int n) {
        int sum;
        if ((n & 1) == 0) {
            sum = (n | 1);
            System.out.println(sum);
        } else {
            sum = -(~n);
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        
        
        Exponential(3, 5);
        ModularExponential(2, 5);
        UpperToLower();
        LowerToUpper();
        Add1toInt(7);
    }
}

// 01 -->1 10-->2
// 01
// 011-->3 100
// 001