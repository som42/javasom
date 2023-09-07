package ch16lambda.book.sec05.exam3;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
        System.out.println("Member(String id)");
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("<ember(String id, String name)");
    }

    @Override
    public String toString() {
        String info = "{ id: " + id + ",name: " + name + "}";
        return info;
    }

}
