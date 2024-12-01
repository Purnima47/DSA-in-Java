public class LargeestStringInArr {
    // O(x * n)
    public static void compare(String fruits[]) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            // fruits[i] > largest then update largest
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        compare(fruits);
    }
}
