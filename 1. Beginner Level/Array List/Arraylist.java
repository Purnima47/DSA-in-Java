import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
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

        System.out.println(monotonicAL());
    }
}
