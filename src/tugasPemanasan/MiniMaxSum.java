package tugasPemanasan;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int jumlah = 0;
        int min = arr[0];
        int max = arr[0];

        for(int isi = 0; isi < arr.length; isi++){
            jumlah = jumlah + arr[isi]; // Sama dengan jumlah += arr[i]

            if (arr[isi] > max){
                max = arr[isi];
            }

            if (arr[isi] < min){
                min = arr[isi];
            }
        }

        int jumlahMax = jumlah - max;
        int jumlahMin = jumlah - min;

        System.out.println(jumlahMax + " " + jumlahMin);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
