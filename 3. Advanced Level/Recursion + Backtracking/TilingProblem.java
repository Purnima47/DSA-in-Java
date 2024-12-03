public class TilingProblem {
    public static int tiling(int n) {
        if (n == 0 || n == 1)
            return 1;
        int n1 = tiling(n - 1);
        int n2 = tiling(n - 2);
        return (n1 + n2);
    }

    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
