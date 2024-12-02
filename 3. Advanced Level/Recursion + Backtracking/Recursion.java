public class Recursion {
    
    

    public static int xtoPowern(int x, int n) {
        if (n == 0)
            return 1;
        int halfPow = xtoPowern(x, n / 2);
        int halfPowSq = halfPow * halfPow;

        if (x % n != 0)
            halfPowSq *= x;

        return halfPowSq;
    }

    public static int tiling(int n) {
        if (n == 0 || n == 1)
            return 1;
        int n1 = tiling(n - 1);
        int n2 = tiling(n - 2);
        return (n1 + n2);
    }

    public static void duplicate(String str, int i, StringBuilder newStr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(i);
        if (map[ch - 'a'] == true)
            duplicate(str, i + 1, newStr, map);
        else {
            map[ch - 'a'] = true;
            duplicate(str, i + 1, newStr.append(ch), map);
        }
    }

    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fm1 = friendsPair(n - 1);
        int fm2 = friendsPair(n - 2);
        int pair = (n - 1) * fm2;
        int totalways = (fm1 + pair);
        return totalways;
    }

    public static void binaryString(String str, int n, int last) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryString(str + "0", n - 1, 0);

        if (last == 0) {
            binaryString(str + "1", n - 1, 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int a[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        tiling(5);
        String str = "purnimakesarwani";
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendsPair(3));
        binaryString("", 4, 0);
    }
}
