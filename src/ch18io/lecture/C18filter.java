package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C18filter {
    public static void main(String[] args) {
        //보조 스트림(filter stream)

        try {
            OutputStream os = getOutputStream("C:/Temp/out8.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
           try(os;osw)
           {
               osw.write('한');
               osw.write('여');
               osw.write('름');

               osw.flush();
           }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    
    public static OutputStream getOutputStream(String file) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(file);
        return os;
    }
}
