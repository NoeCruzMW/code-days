import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        int size = s.length() > 0 ? s.length() % 2 == 0 ? (s.length() / 2) : (s.length() / 2) + 1 : 0;
        String[] chunks = new String[size];
        int p = 0;
        while (!s.isEmpty()) {
            if (s.length() == 1) {
                chunks[p] = String.format("%s_", s);
                break;
            }
            chunks[p] = s.substring(0, 2);
            s = s.substring(2);
            p++;
        }
        return chunks;
    }

    public static String[] solution2(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }

    public static void main(String[] args) {
        String s = "abcdef";
        String s1 = "HelloWorld";
        String s2 = "abcde";
        String s3 = "LovePizza";
        System.out.println(Arrays.toString(StringSplit.solution2(s)));
        System.out.println(Arrays.toString(StringSplit.solution2(s1)));

        System.out.println(Arrays.toString(StringSplit.solution2(s2)));
        System.out.println(Arrays.toString(StringSplit.solution2(s3)));
    }
}
