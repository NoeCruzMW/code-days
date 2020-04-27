
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * SoftwareForSearching01
 * 
 * @author Noé Cruz López | Zurck'z 2020 | contactozurckz@gmail.com
 * @version 1.0 15-03-2020 Judge COJ Problem
 *          https://coj.uci.cu/24h/problem.xhtml?pid=2712
 */
public class SoftwareForSearching01 {

    public static void main(final String[] args) {
        final InputStreamReader iStreamReader = new InputStreamReader(System.in);
        final BufferedReader bufferedReader = new BufferedReader(iStreamReader);

        int n, i, t;
        String name[];
        Map<String, Integer> people = new HashMap<>();

        try {
            n = Integer.parseInt(bufferedReader.readLine());
            for (i = 0; i < n; i++) {
                name = bufferedReader.readLine().split("\\ ");
                if (people.containsKey(name[1])) {
                    people.put(name[1], people.get(name[1]) + 1);
                    continue;
                }
                people.put(name[1], 1);
            }
            t = Integer.parseInt(bufferedReader.readLine());
            name = new String[t];
            for (i = 0; i < t; i++) {
                name[i] = bufferedReader.readLine().split("\\ ")[1];
            }
            for (i = 0; i < t; i++) {
                System.out.println(people.containsKey(name[i]) ? people.get(name[i]) : 0);
            }
        } catch (IOException e) {
        }
        bufferedReader.close();
        iStreamReader.close();
    }
}
