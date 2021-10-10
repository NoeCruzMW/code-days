
/**
 * Disemvowel Trolls
 * 
 * @author Noé Cruz López | Zurck'z 2020 | contactozurckz@gmail.com
 * @version 1.0 27-04-2020 Code Forces 
 */

/**
 * Trolls are attacking your comment section!
 * 
 * A common way to deal with this situation is to remove all of the vowels from
 * the trolls' comments, neutralizing the threat.
 * 
 * Your task is to write a function that takes a string and return a new string
 * with all vowels removed.
 * 
 * For example, the string "This website is for losers LOL!" would become "Ths
 * wbst s fr lsrs LL!".
 */

public class DisemvowelTrolls02 {

    public static String disemvowel(String str) {
        return str.replaceAll("[AaEeIiOoUu]", "");
    }

    public static void main(String[] args) {
        String test = "This website is for losers LOL!";
        System.out.println(disemvowel(test));
    }
}