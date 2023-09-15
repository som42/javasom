package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        //outputStream : 바위트 단위 출력 스트림
        try {
            OutputStream os = new FileOutputStream("out.txt");
            os.write(70); //4바이트라도 마지막 1바이트만 쓰고 나머지는버려진다.
            os.write(71);
            os.write(73);

            os.close(); //그리고 무조건 마지막꼭 닫아줘야한다.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}