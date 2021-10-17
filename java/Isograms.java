import java.util.Arrays;
import java.util.Locale;

/**
 * Isograms
 */
public class Isograms {

    public static boolean isIsogram(String str) {
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++)
            if (str.substring(i + 1, str.length()).indexOf(str.charAt(i) + "") >= 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        assertEquals(true, Isograms.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isograms.isIsogram("isogram"));
        assertEquals(false, Isograms.isIsogram("moose"));
        assertEquals(false, Isograms.isIsogram("isIsogram"));
        assertEquals(false, Isograms.isIsogram("aba"));
        assertEquals(false, Isograms.isIsogram("moOse"));
        assertEquals(true, Isograms.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isograms.isIsogram(""));
    }

    static String assertEquals(boolean expected, boolean computed) {
        System.out.println(expected + " - " + computed + (expected == computed ? " -  OK" : " -  FAIL"));
        // return expected == computed ? "OK" : "FAIL";
        return "";
    }
}