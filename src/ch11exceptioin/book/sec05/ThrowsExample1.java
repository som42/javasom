package ch11exceptioin.book.sec05;

import 연습.리트코드.P1684;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try{
            fidnClass();
        }catch (ClassNotFoundException e){
            System.out.println("e.toString() = " + e.toString());
            e.printStackTrace();
        }
    }
    public static void fidnClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}

