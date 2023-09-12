package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java","css","spring");
        Stream<String > stream = list.stream();

        stream.count();

//        stream.count();// 지나가서 다시 사용할수 없다.
        //최종연산이 끝나 stream을 재사용 할수 없음
        //그래서 다시 만들어서 사용해야 한다.

        Stream<String> stream2 = list.stream();
        stream2.count();

        System.out.println("프로그램 실행 중...");
    }
}
