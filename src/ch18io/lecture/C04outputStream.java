package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04outputStream {
    public static void main(String[] args) {
        String path = "C:/Tamp/out1.txt"; //파일만들기!
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(70); // int 마지막 1byte
            os.write(71);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("종료했다!");
    }
}
