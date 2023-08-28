package Baic_08;

import java.util.Scanner;

public class Test_06 {
	int a,b,c;
	
	void func() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번쨰 수 : ");
		a =scan.nextInt();
		
		System.out.print("두 번째 수 : ");
		b =scan.nextInt();
		
		c = a>b? a: b; //삼항 연산자 ? 조건을 물어보는거 
		System.out.printf("두 수 중 큰 값은 : %d" ,c);
		
		
	}

	public static void main(String[] args) {
		
		Test_06 aa = new Test_06();
		aa.func();
	}

}
