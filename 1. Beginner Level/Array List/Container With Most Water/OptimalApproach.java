import java.util.*;

public class OptimalApproach {
    public static void storeWaterUsingPointers(ArrayList<Integer> height) {
        // O(n) --> Two Pointer Approach
        int lp = 0;
        int rp = height.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            // calculate water level
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int currentWater = ht * wd;
            maxWater = Math.max(maxWater, currentWater);

            // update pointers
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(maxWater);
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        storeWaterUsingPointers(height);
    }
}
