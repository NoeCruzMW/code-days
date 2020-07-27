import java.util.Arrays;

/**
 * Given five positive integers, find the minimum and maximum values that can be
 * calculated by summing exactly four of the five integers. Then print the
 * respective minimum and maximum values as a single line of two space-separated
 * long integers.
 */
class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min=0, max=0;
        for (int i = 0; i < 4; i++) {
            min+=arr[i];
            max+=arr[4-i];
        }
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        int[] fTest = { 1, 2, 3, 4, 5 };
        int[] sTest = { 1, 3, 5, 7, 9 };
        miniMaxSum(fTest);
        miniMaxSum(sTest);
    }
}