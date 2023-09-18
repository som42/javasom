package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23Keyboard {
    public static void main(String[] args) {

        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);

//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

            try (br; isr) {
                String line1 = br.readLine(); // 한줄씩 읽는다.
                System.out.println("line1 = " + line1);

                String line2 = br.readLine(); // 한줄씩 읽는다.
                System.out.println("line1 = " + line2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
