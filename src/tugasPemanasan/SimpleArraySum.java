package tugasPemanasan;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        int jumlah = 0;
        // Statement normal loop
//        for (int isi = 0; isi < ar.length; isi++) {
//            jumlah = jumlah + ar[isi];
//        }

        // Statement loop foreach
        // Lebih singkat
        for (int isi : ar) {
            jumlah = jumlah + isi;
        }

        return jumlah;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

