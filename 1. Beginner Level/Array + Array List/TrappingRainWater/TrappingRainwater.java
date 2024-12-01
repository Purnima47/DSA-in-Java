package TrappingRainWater;
//AUXILIARY ARRAYS
// (waterLevel - height/baseLevel) * width = trapped water for each pillar.

// we have to find waterLevel

// CASES -
/*
 * 1. Single Bar --> No water will be trapped
 * 2. 2 Bars --> No water will be trapped
 * 
 * i.e. minimum bars will be three for water to be trapped.
 * 
 * 3. If we have bars in ascending or descending order of height then no water will be trapped.
 */

//  waterLevel = minimum(maxLeftBoundary, maxleft1Boundary)

import java.util.*;

public class TrappingRainwater {
    public static void trap(int height[], int n) {
        // LEFT MAX
        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Right MAX
        int right[] = new int[n];
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        // MIN OF BOTH
        int vol = 0;
        for (int i = 0; i < n; i++) {
            vol += Math.min(left[i], right[i]) - height[i];
        }
        System.out.println(vol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;
        trap(height, n);
    }
}
