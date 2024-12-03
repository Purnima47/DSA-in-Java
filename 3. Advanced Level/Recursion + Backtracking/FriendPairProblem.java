public class FriendPairProblem {
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

    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}
