import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Candles{

    static int birthdayCakeCandles2(int[] ar) {
        Arrays.sort(ar);
        long i=ar.length-1;        
        for(;ar[ar.length-1]==ar[i];i--){}
        return (ar.length-1)-i;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int result = birthdayCakeCandles(new int[]{3,2,1});
        System.out.println(result);
    }
}