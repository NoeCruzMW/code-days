/**
 * Multiples
 */
public class Multiples {

    public int solution(int number) {
        int i = 1, sum = 0;
        do {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
            i++;
        } while (i < number);
        return sum;
    }

    public static void main(String[] args) {
        assertEquals(23, new Multiples().solution(10));
    }

    public static void assertEquals(int n1, int sol) {
        System.out.println(sol);
        if (n1 == sol) {
            System.out.println("Ok");
        } else {
            System.out.println("Expeted 23");
        }
    }
}