package ch07extends.lectre;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "쏨이";
        Object o = s;
        String t = new String("쏨이");

//       String t = o; //이거는 안된다

        int v1 = s.hashCode();
        int v2 = o.hashCode();
        int v3 = t.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);


        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(o));
        System.out.println(System.identityHashCode(t));
    }
}
