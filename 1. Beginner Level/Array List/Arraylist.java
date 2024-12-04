import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    // O(n)
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

    // O(n)
    public static boolean monotonicAL() {
        ArrayList<Integer> mono = new ArrayList<>();
        mono.add(1);
        mono.add(6);
        mono.add(5); // 6 5 5 4 3 1
        mono.add(5);
        mono.add(4);
        mono.add(3);
        mono.add(3);
        boolean Increasing = true;
        boolean Decreasing = true;

        for (int i = 0; i < mono.size(); i++) {

            {
                if (mono.get(i) > mono.get(i + 1)) {
                    Increasing = false;
                } else if (mono.get(i) < mono.get(i + 1)) {
                    Decreasing = false;
                }
            }
        }
        return (Increasing || Decreasing);
    }

    // public static boolean monotonicAL2() {
    // ArrayList<Integer> mono = new ArrayList<>();

    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ADD FUNCTION - O(1)
        list.add(5);
        list.add(1);
        list.add(20);
        list.add(12);
        list.add(0);
        System.out.println(list);
        
        // O(N)
        list.add(5, 13);

        // GET FUCTION - O(1)
        System.out.println(list.get(list.size() - 1));

        // REMOVE FUNCTION - O(N)
        list.remove(2);

        // SET FUNCTION - O(N)
        list.set(2, 10);

        // CONTAINS FUNCTION - O(N)
        System.out.println(list.contains(12));

        System.out.println(list);
        
        // ascending order
        Collections.sort(list);
        
        System.out.println(list);
        
        // descending order
        Collections.sort(list, Collections.reverseOrder()); // comparator function
        
        System.out.println(list);

        ArrayList<Integer> rotated = new ArrayList<>();
        rotated.add(11);
        rotated.add(15);
        rotated.add(6);
        rotated.add(8);
        rotated.add(9);
        rotated.add(10);
        System.out.println(pairSumInSortedRotatedAL(rotated, 16));

        System.out.println(monotonicAL());
    }
}
