package ch16lambda.book.sec3;

public class Person {
    public static void action1(Workable workable){
        workable.work("김래환","개발자");
    }

    public void action2(Speakable speakable){
        speakable.speak("하이룽");
    }
}
