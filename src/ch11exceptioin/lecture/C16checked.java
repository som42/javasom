package ch11exceptioin.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16checked {
    public static void main(String[] args) {
        try {
            var input = new FileInputStream("file");
            //checked exception 은
            //예외처리코드(try꼭 감싸주세용) 꼭 작성
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
