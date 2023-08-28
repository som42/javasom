package ch05reference;

public class C05array {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b = a;
		
		System.out.println(b[2]);
		System.out.println(a[2]);
		
		//참조형은 일반형과 다르고 주소값을 주는것이다
		//같은 메모리박스를 복수붙여넣기가아니라 주소값을 서로 공유하는것
		a[2] = 7;
		System.out.println(b[2]);
		
		int[] c = {10,20,30};
		int[] d = {10,20,30};
		//안에 내용이같아도 c,d의 주소값은 다르다
		//같은 객체라도 할수없다
		System.out.println(d[2]);
		
		c[2] = 90;
		
		System.out.println(c[2]);
		System.out.println(d[2]);
		//c,d는 다른 객체이고 다른 주소값을 같고있기때문에
		//c가 바뀐다고 d의 값을 바뀌지 않기때문에 30이다
		
	}
}
