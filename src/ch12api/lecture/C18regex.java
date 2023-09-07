package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        //regular expression : 정규표현식(정규식, 정규식 표현)
        //문자열의 패턴을 나타내는 기호들

        //문자
        System.out.println("x".matches("x"));
        System.out.println("a".matches("a"));
        System.out.println("a".matches("x"));

        //문자들
        System.out.println("xyz".matches("xyz"));
        System.out.println("xxx".matches("xxx"));
        System.out.println("xxx".matches("x"));
        //수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); //o
        System.out.println("aaa".matches("a{3}"));
        System.out.println("aa".matches("a{3}"));
        //뒤에 저렇게 1.3써주면 1번을넣던 2번을넣던 3번을넣더 트루
        System.out.println("aaa".matches("a{1,3}"));
        System.out.println("aa".matches("a{1,3}"));
        System.out.println("a".matches("a{1,3}"));

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));

        //그룹 : ()
        System.out.println("dodog".matches("(do){1,3}g"));
        System.out.println("dododog".matches("(do){1,3}g"));
        System.out.println("dog".matches("(do){1,3}g"));

        //수량 : 한개 이상 무한으로
        System.out.println("dog".matches("do{1,}g"));
        System.out.println("doog".matches("do{1,}g"));
        System.out.println("dooog".matches("do{1,}g"));
        System.out.println("doooog".matches("do{1,}g"));
        System.out.println("dooooog".matches("do{1,}g"));

        //? : 없거나 한번
        System.out.println("dg".matches("do?g"));
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g"));

        //* : 0번 이상
        System.out.println("dg".matches("do*g"));
        System.out.println("dog".matches("do*g"));
        System.out.println("doog".matches("do*g"));
        System.out.println("dooog".matches("do*g"));
        // + : 1번 이상
        System.out.println("dg".matches("do+g"));
        System.out.println("dog".matches("do+g"));
        System.out.println("doog".matches("do+g"));
        System.out.println("dooog".matches("do+g"));

        //문자 분류 (Character classes)[]안에 문자랑같으면 트루
        System.out.println("dog".matches("d[oi]g"));
        System.out.println("dig".matches("d[oi]g"));
        System.out.println("dag".matches("d[oi]g"));
        //^ 아닐때
        System.out.println("dog".matches("d[^oi]g"));
        System.out.println("dig".matches("d[^oi]g"));
        System.out.println("dag".matches("d[^oi]g"));
        //범위를 나타낼때는 [a-z]
        System.out.println("dag".matches("d[a-z]g"));
        System.out.println("dbg".matches("d[a-z]g"));
        System.out.println("dcg".matches("d[a-z]g"));
        System.out.println("dcg".matches("d[a-z]g"));

        System.out.println("dag".matches("d[a-cx-z]g"));

        //문자 분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        //자바에서는 \쓸꺼면 한번떠써야함 \d = [0-9]와 같다
        System.out.println("7".matches("\\d"));
        System.out.println("0".matches("\\d"));
        //[a-zA-Z_0-9] = \w
        System.out.println("a".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));

        //예제 : 숫자로 시작하면 안되고, 영문대소문자, _$
        String pattern = "[a-zA-z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern));

        // 전화번호 패턴
        //010-9999-9999
        //02-9999-999
        //02-999-9999
        // 맨앞에 2~3자리숫자 중간에도 3~4자리 마지막4자리 -기호있어도되고 없어도되고
        String pat = "(\\d{2,3}-?)(\\d{3,4}-?)(\\w{4}-?)";
        System.out.println("010-9999-9999".matches(pat));

            //모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));
        System.out.println(".".matches("."));

        // . : \. 점만 나타내고 싶을때
        System.out.println(" ".matches("\\."));
        System.out.println("a".matches("\\."));
        System.out.println("3".matches("\\."));
        System.out.println("+".matches("\\."));
        System.out.println(".".matches("\\."));

        //이메일 패턴
        // 영문소문자,숫자가 여러개 @ 영문소문자,숫자 여러개 . 영문소문자,숫자여러개

        String a ="[a-z\\d]+\\@[a-z\\d]+\\.[a-z\\d]+";
        String a1 = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]";
        System.out.println("dosom23@naver.com".matches(a));

        // or : |(pipe,or)
        System.out.println("auefhdogsod".matches(".*dog.*"));
        System.out.println("932catlkd".matches(".*cat.*"));
        System.out.println("932catlkd".matches(".*(dog|cat).*"));
        System.out.println("932catlkd".matches(".*(dog|cat).*"));


    }
}
