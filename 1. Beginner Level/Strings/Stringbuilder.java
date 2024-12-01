// Strings are Immutable --> if any change is made then it makes copy of that
// string i.e. it stores string in new memory whenever any change is made
// Time Complexity increases in strings.
// Therefore we use String Builder.

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
// T.C. 
// String --> O(26 * n^2)
// but in StringBuilder --> O(26) 
