package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path = "C:/Temp/out3.txt";

        try (OutputStream os = new FileOutputStream(path)) {

            byte[] b = {65, 66, 67, 68, 69};

            os.write(b); //b배열 다쓰는거고
            os.write(b, 0, 3);
            //       b의 0부터 3개
            os.write(b, 2, 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
