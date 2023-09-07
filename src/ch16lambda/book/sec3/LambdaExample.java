package ch16lambda.book.sec3;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        Person.action1((name, job) -> {
            System.out.println(name + "이 ");
            System.out.println(job + "을 합니다");
        });

        person.action1((name, job) -> {
            System.out.println(name + "이 " + job + "을 하지않습니다" );
        });

        person.action2(Word -> {
            System.out.println( Word +"라고 말합니다 ");
        });

        person.action2(word -> System.out.println(word + "외칩니다"));
    }

}

class MySpeakabel implements Speakable{

    @Override
    public void speak(String content) {
        System.out.println(content + "라고 외칩니다");
    }
}