package ch18io;

import java.io.*;
import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        String srcPath = "";
        String desPath = "";

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("원본 파일 경로 :");
            srcPath = scanner.nextLine();

            System.out.println("복사 파일 경로 :");
            desPath = scanner.nextLine();

            File srcFile = new File(srcPath);
            if (srcFile.exists()) {
                File desFile = new File(desPath);
                File desFileDir = desFile.getParentFile();
                if (!desFileDir.exists()) {
                    desFileDir.mkdirs();
                }

                //복사하는 일
                InputStream is = new FileInputStream(srcFile);
                OutputStream os = new FileOutputStream(desPath);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try(bos;bis;is;os;) {
                    byte[] read = new byte[1024];
                    int len = 0;


                    while ((len = is.read()) != -1) {
                        os.write(read, 0, len);
                    }
                    System.out.println("복상 성공했다이");
                }
            } else {
                System.out.println("원본 파일이 존재하지 않습니다");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
