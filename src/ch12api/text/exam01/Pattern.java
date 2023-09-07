package ch12api.text.exam01;

public class Pattern {
    public static void main(String[] args) {
        String id = "aAngel1004";
        String regExp ="[a-zA-z]\\w{7,11}";
        boolean isMatch = id.matches(regExp);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다");
        }
//        String pattern = ".*b.b.*";
//        return str.matches(pattern);

        String b = "zipXzap";
        String c = b.replace("z","p");
        System.out.println(c);
    }
}
