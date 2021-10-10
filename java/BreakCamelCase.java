import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * BreakCamelCase
 */
public class BreakCamelCase {

    static Predicate<Integer> isUpperCase = i -> i >= 65 && i <= 90;

    public static String camelCase(String input) {
        final List<String> words = new ArrayList<>();
        int lastPosition = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isUpperCase.test(input.codePointAt(i))) {
                words.add(input.substring(lastPosition, i));
                lastPosition = i;
            }
        }
        words.add(input.substring(lastPosition, input.length()));
        return String.join(" ", words);
    }

    public static String camelCase2(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    public static void main(String[] args) {
        System.out.println(BreakCamelCase.camelCase2("camelCasing2dsad"));
        System.out.println(BreakCamelCase.camelCase2("camelCasingTest"));
        System.out.println(BreakCamelCase.camelCase2("camelcasingtest"));
        System.out.println(BreakCamelCase.camelCase2(""));
    }
}