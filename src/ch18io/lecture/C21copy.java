package ch18io.lecture;

import java.io.*;

public class C21copy {
    public static void main(String[] args) {
        //BufferedInputStream
        //BufferedOutputStream

        String src = "C:/Temp/test.jpg";
        String dec = "C:/Temp/test3.jpg";

        try {
            InputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dec);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try {
                byte[] buf = new byte[1024];
                int len = 0;
                while ((len = bis.read(buf)) != -1){
                    bos.write(buf, 0, len);

                }
            }catch (IOException e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
