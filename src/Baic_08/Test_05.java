package Baic_08;

import java.util.Scanner;

import 연습.do_0;

public class Test_05 {
	
	
	
	static int a ;
	static int b ;
	static double c;
	
	
	
	static void cc () {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 넓이를 구해보자");
		System.out.println("밑변에 길이를 입력하시오");
		a =scan.nextInt();
		System.out.println("높이에 길이를 입력하시오");
		b =scan.nextInt();
		c=(double)(a*b)/2;
	    System.out.printf("\n삼각형의 넓이는 = %.2f",c);
	}

	public static void main(String[] args) {
	
		cc();
	}

}
