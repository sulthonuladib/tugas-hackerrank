package tugasArray2Dimensi;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array2D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int jumlahMaksimal = 0;
        for (int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                int jumlahHourglass = arr[baris + 0][kolom + 0] + arr[baris + 0][kolom + 1] + arr[baris + 0][kolom + 2]
                                                    + arr[baris + 1][kolom + 1] +
                          arr[baris + 2][kolom + 0] + arr[baris + 2][kolom + 1] + arr[baris + 2][kolom + 2];

                jumlahMaksimal = Math.max(jumlahMaksimal, jumlahHourglass);
            }
        }
        return jumlahMaksimal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
