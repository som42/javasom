package ch18io.book.sec06;

import ch08interface.book.sec10.exam01.E;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write ("문자 변환 스트림을 사용합니다.");
        String date = read();
        System.out.println(date);
    }
    public static void write(String str) throws Exception{
        //보조 스트림을 연결
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os,"UTF-8");
        writer.write(str); // 보조 스트림을 이용해서 문자 출력
        writer.flush();
        writer.close();
    }
    public static String read() throws Exception{
        // 보조 스트림 연결
        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is,"UTF-8");
        char[] date = new char[100]; // 보조 스트림을 이용해서 문자 입력
        int num = reader.read(date);
        reader.close();
        //char 배열에서 읽은 문자 수만큼 문자열로 변환
        String str = new String(date,0,num);
        return str;
    }
}
