package ch18io.lecture;

import java.io.*;

public class C16copy {
    public static void main(String[] args) {
        String src = "src/ch18io/lecture/C16copy.java";
        String des = "C:/Temp/C16copy.java";

        try {
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);
            try (reader; writer) {
                char[] chars = new char[100];
                int len = 0;

                while ((len = reader.read(chars)) != -1) {


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
