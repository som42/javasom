package ch18io.lecture;

public class C26printf {
    public static void main(String[] args) {
        //%s : 문자열 출력
        //뒤에 애가 s에 들어가기때문에 %s쓸때는 뒤에꼭 써줘야한다
        System.out.printf("문장열 : %s%n", "한여름");
        System.out.printf("문자열1 : %s%n문자열2 : %s%n","css","react");

        //%d : 정수 십진법 출력
        System.out.printf("정수 : %d%n",109);
        System.out.printf("정수1 : %d%n정수2 : %d%n",119,112);

        // argument_index$  index 번호쓰고 $ 넣으면됨
        System.out.printf("정수2 : %2$d%n정수1 : %1$d%n",100,200);
        System.out.printf("정수 : %1$d%n",9,8);
        System.out.printf("정수 : %2$d%n",9,8);
    }
}
