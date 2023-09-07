package ch16lambda.book.sec2.exam01;

public class LambdExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(() ->{
            System.out.println("출근 고고");
            System.out.println("프로그래밍 고고");
        });

        person.action(() -> System.out.println("퇴근 합니다"));
    }
}
