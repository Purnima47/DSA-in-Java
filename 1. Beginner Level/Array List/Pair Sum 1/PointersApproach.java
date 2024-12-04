import java.util.*;
public class PointersApproach {
    public static boolean pairSumUsingPointer(ArrayList<Integer> sum, int target) {
        // list must be sorted
        int lp = 0;
        int rp = sum.size() - 1;
        while (lp < rp) {
            if ((sum.get(lp) + sum.get(rp)) == target) {
                System.out.println(sum.get(lp) + "+" + sum.get(rp) + "=" + target);
                return true;
            } else if ((sum.get(lp) + sum.get(rp)) < target) {
                lp++;
            } else {
                rp--;
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
        System.out.println(pairSumUsingPointer(sum, 8));
    }
}
