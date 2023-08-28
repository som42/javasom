package ch05reference;

public class C08array {
	@SuppressWarnings("unused")
	private void main() {
		
		//배열한  a,b,c주소값 찾기
		int[] a = {3, 4, 5};
		int[] b = {3, 4, 5};
		int[] c = a;
		
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
		
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
		
		System.out.println(a[0]);
		a[0] =33;
		System.out.println(a[0]);
		System.out.println(c[0]);
		System.out.println(b[0]);
	}
}
