package ch18io.book.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);

            byte[] date = new byte[1024]; //읽은 바이트 저장할 배열생성
            while (true) {
                int num = is.read(date); // 최대 1024바이트 읽고 배열에 저장
                if (num == -1) break; // 파일다읽으면 while문 종료
                os.write(date, 0, num); //읽은 바이트 수만큼 출력
            }
            os.flush();
            os.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("복사가 잘 되었습니다");

    }
}
