package ch12api.lecture;

public class C12string {
    public static void main(String[] args) {
        // length : 길이
        String a = "제주";
        String b = "부산 공항";
        String c = "제주 공항 비행기";
        String d = "hi 제주";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());

        //text block
        //가장 왼쪽 들여쓰기 기준
        String e = """
                제주도 가서 
                고기 국수를 너무
                먹고 싶어요
                """;
        System.out.println(e.length());
    }
}
