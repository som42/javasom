package ch17stream.book.sec12.exam03;

import ch15collection.text.Board;

import javax.swing.border.Border;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //Vector 컬렉션 생성
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; i <= 1000; i++) {
                    list.add(new Board("제목"+i, "내용"+i));
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목"+i,"내용"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){

        }

        int size = list.size();
        System.out.println("총 객체 수 " + size);
        System.out.println();
    }
}
