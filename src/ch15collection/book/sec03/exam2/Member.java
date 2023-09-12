package ch15collection.book.sec03.exam2;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (age != member.age) return false;
        return Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}