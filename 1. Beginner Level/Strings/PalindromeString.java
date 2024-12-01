public class PalindromeString {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not a palindrome string");
                return false;
            }
        }
        System.out.println("Given string is a palindrome string");
        return true;
    }
    
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
