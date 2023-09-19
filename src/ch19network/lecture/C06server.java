package ch19network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C06server {
    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String path = "C:/Temp/test3.jpg";

            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (serverSocket; socket; is; bos; bis; fos;) {
                byte[] bytes = new byte[1024];
                int length = 0;

                while ((length = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, length);
                }
                System.out.println("파일 끝");
                bos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
