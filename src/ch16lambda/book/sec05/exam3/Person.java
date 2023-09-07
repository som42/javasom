package ch16lambda.book.sec05.exam3;

public class Person {
    public Member getMember1(Creatable1 creatable){
        String id = "winter";
        Member member = creatable.create(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable){
        String id = "winter";
        String name = "한여름";
        Member member = creatable.create(id,name);
        return member;
    }
}
