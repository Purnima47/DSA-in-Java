import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSumInSortedRotatedAL(ArrayList<Integer> rotated, int target) {
        int bp = -1;
        int n = rotated.size();
        for (int i = 0; i < rotated.size(); i++) {
            if (rotated.get(i) > rotated.get(i + 1)) {
                bp = i; // breaking point
                break;
            }
        }

        int lp = bp + 1; // smallest element
        int rp = bp; // largest element

        while (lp != rp) {

            if ((rotated.get(lp) + rotated.get(rp)) == target) {
                System.out.println(rotated.get(lp) + "+" + rotated.get(rp) + "=" + target);
                return true;
            }
            if ((rotated.get(lp) + rotated.get(rp)) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> rotated = new ArrayList<>();
        rotated.add(11);
        rotated.add(15);
        rotated.add(6);
        rotated.add(8);
        rotated.add(9);
        rotated.add(10);
        System.out.println(pairSumInSortedRotatedAL(rotated, 16));
    }
}
