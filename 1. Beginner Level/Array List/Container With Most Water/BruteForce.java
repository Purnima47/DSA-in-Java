import java.util.*;
public class BruteForce {
    public static int storeWaterBruteForce(ArrayList<Integer> height) {
        // O(n^2)
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j - i;
                int currentWater = ht * wd;
                maxWater = Math.max(maxWater, currentWater);
            }
        }

        return maxWater;
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
        System.out.println("Maximum area of water stored is: " + storeWaterBruteForce(height));
    }
}
