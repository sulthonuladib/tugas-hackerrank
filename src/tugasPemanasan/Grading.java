package tugasPemanasan;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        // Instansiasi return value List, karena di template link hackerrank function gradingStudents me return List
        // Atau harus return array ? karena sedang dalam materi array.
        List<Integer> list = new ArrayList<>();

        // Mungkin agak sulit di mengerti karena harusnya ada di materi Program berorientasi objek

        // Normal for statement
//        for (int grade = 0; grade < grades.size(); grade++) {
//            if (grades.get(grade) < 38 || grades.get(grade) % 5 <= 2) {
//                list.add(grades.get(grade));
//            } else if (grades.get(grade) % 5 > 2) {
//                int bulat = 5 - (grades.get(grade) % 5);
//                list.add(grades.get(grade) + bulat);
//            }
//        }

        // Lebih singkat menggunakan for each
        for (int grade : grades) {
            if (grade < 38 || grade % 5 <= 2) {
                list.add(grade);
            } else if (grade % 5 > 2) {
                int bulat = 5 - (grade % 5);
                list.add(grade + bulat);
            }
        }

        return list;
    }

}
public class Grading {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
