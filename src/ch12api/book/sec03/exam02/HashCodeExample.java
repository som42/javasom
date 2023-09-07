package ch12api.book.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1,"한여름");
        Student s2 = new Student(1,"한여름");

        if(s1.hashCode() == s2.hashCode()){
            if (s1.equals(s2)) {
                System.out.println("동등 객체입니다");
            }else {
                System.out.println("데이터가 다르므로 동등 객체 아님");
            }
        }else{
            System.out.println("해시코드가 다르므로 동등 객체가아님");
        }
    }
}
