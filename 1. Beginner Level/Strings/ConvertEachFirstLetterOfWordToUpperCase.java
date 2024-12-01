public class ConvertEachFirstLetterOfWordToUpperCase {
    public static void main(String[] args) {
        String name = "hi, i am purnima";
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);

        for (int i = 1; i < name.length(); i++) {
            if ((name.charAt(i) == ' ') && (i < name.length() - 1)) {
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            } else {
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
