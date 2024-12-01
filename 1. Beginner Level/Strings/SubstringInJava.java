public class SubstringInJava {
    public static void substringFn(String str, int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {

            sub += str.charAt(i);
        }
        System.out.println(sub);
    }

    public static void main(String[] args) {
        String str = "apple";
        substringFn(str, 2, 5);
    }
}
