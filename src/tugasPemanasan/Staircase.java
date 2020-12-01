package tugasPemanasan;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {
    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                int k = n - i;
                if (j < k ) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
                // Atau lebih singkat dengan ternary operator
                // System.out.println( j < k ? " " : "#");
            }
            System.out.println(" ");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
