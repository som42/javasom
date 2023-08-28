package ch05reference;

public class C11method {
	public static void main(String[] args) {
		
		int [] a = name();
		
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a));
	}
	
	public static  int[] name() {
		
		int[] c = {9, 7, 5};
		
		System.out.println("name 내부");
		System.out.println(System.identityHashCode(c));
		return c;
	}
}
