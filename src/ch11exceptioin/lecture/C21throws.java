package ch11exceptioin.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C21throws {
    public static void main(String[] args) {
        try {
            var input = new FileInputStream("file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
