package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1(){
        OutputStream os = null;

        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                os.close(); // io stream을 꼭 닫아야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2(){

        //try - with - resource 문법
        //close를 안써도 자동으로 닫아짐
        //변수의 타입에 AutoCloseable임이어야 함
        try(OutputStream os = new FileOutputStream("");) {

            os.write(33);
            os.write(67);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void method3(){
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
        ) {
            fos.write(234);
            fis.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4(){

        //값이 한번만 할당 됬을때는 변수이름만적어두된다
        Scanner scanner = new Scanner("");
        try (scanner) {
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5(){
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fod = new FileOutputStream("");

            try(fio;fod;){
                fio.read();
                fod.write(33);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
