package ch05reference;

public class C06matrix {
	public static void main(String[] args) {
		//이차 배열은 int 배열배열이라 참조타입이다
		int[][] a = {{1,2,3},{10,20,30},{100,200,300}};
		int[][] b = a;
		
		System.out.println(a==b);
		
		a[1][1] = 2000;
		System.out.println(a[1][1]);
		System.out.println(b[1][1]);
		
		b[2][2] = 999;
		System.out.println(a[2][2]);
		System.out.println(b[2][2]);
		
		b[2] = new int[] {111,222,333};
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		//b에 새객체의 참조값 할당됨
	
		b = new int[][] {{33,44},{22,11}};
		System.out.println(b[0][0]);
		System.out.println(a[0][0]);
		
		
	}
}
