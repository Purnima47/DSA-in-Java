public class RemoveDuplicatesInString {
    public static void duplicate(String str, int i, StringBuilder newStr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(i);
        if (map[ch - 'a'] == true)
            duplicate(str, i + 1, newStr, map);
        else {
            map[ch - 'a'] = true;
            duplicate(str, i + 1, newStr.append(ch), map);
        }
    }

    public static void main(String[] args) {
        String str = "purnimakesarwani";
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
