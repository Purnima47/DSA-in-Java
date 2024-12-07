import java.util.*;

public class BruteForceApproach {
    public static boolean pairSumUsingBruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(1);
        sum.add(2);
        sum.add(3);
        sum.add(4);
        sum.add(5);
        System.out.println(pairSumUsingBruteForce(sum, 5));
    }
}
