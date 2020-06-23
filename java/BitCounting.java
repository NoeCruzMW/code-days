/**
 * 
 * Write a function that takes an integer as input, and returns the number of
 * bits that are equal to one in the binary representation of that number. You
 * can guarantee that input is non-negative. Example: The binary representation
 * of 1234 is 10011010010, so the function should return 5 in this case
 */

public class BitCounting {

    public static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(countBits(4));
        System.out.println(countBits(7));
        System.out.println(countBits(9));
        System.out.println(countBits(10));
    }
}