// Ques No. - 3136 (LeetCode)
public class StringComp {
    public static void main(String[] args) {
        String comp = "aaaabbbccd";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < comp.length(); i++) {
            Integer count = 1;
            while ((i < comp.length() - 1) && (comp.charAt(i) == comp.charAt(i + 1))) {
                count++;
                i++;
            }
            sb.append(comp.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
}
