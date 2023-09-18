package ch18io.book.sec02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/ch18io/book/sec02/Example.java";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            try (fr; br;) {

                int rowNumber = 0;
                String rowDate;
                while (true) {
                    rowDate = br.readLine();
                    rowNumber++;
                    if (rowDate == null) {
                        break;
                    }
                    System.out.printf("%2d : %s%n", rowNumber, rowDate);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
