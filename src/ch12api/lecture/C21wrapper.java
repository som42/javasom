package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i);
        Object k = j;

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7;

        Integer q = (Integer) o; //하지마캐쉥키얌
        int r = q;

        int s = 30;
        long t = s;

        Integer u = 300;
//        Long v = u;  // 다형성때문에 안된다.

        float w = 3.14f;
        double x = w;

        Float y = 3.14f;
//        Double z = y;

    }
}
