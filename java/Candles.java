import java.io.IOException;
import java.util.Arrays;

class Candles {

    static int birthdayCakeCandles2(int[] ar) {
        Arrays.sort(ar);
        long i = ar.length - 1;
        for (; ar[ar.length - 1] == ar[(int) i]; i--) {
        }
        return (ar.length - 1) - (int) i;
    }

    public static void main(String[] args) throws IOException {
        int result = birthdayCakeCandles2(new int[] { 3, 2, 1 });
        System.out.println(result);
    }
}