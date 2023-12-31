package ch18io.book.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);  // 1byte씩 출력
            os.write(b);
            os.write(c);

            os.flush(); //내부 버퍼에 잔류하는 바이트 출력하고 버퍼를 비움

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
