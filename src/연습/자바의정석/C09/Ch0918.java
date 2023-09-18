package 연습.자바의정석.C09;

import java.util.*;

public class Ch0918 {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>();    // Queue 변수 생성
        int tmp = 0;
        for (int i = 1; i <= 5; i++) {
            que.offer(i);    // 값 추가
        }
        System.out.println(que);

        for (int i = 1; i <= 5; i++) {
            tmp = que.peek();    // 첫번째 값 return
            que.offer(tmp);        // 값 추가
            System.out.println(que.remove());    // 첫번째 값 삭제 및 출력
        }
        System.out.println("-----------------------");

        for (int i = 1; i <= 5; i++) {
            que.offer(i);        // 값 추가
        }
        System.out.println(que);
        que.offer(que.poll()); //첫번째 값 삭제하고 맨뒤로 보낸다.
        System.out.println(que);
    }
}
