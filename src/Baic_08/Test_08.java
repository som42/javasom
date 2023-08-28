package Baic_08;

import java.util.Scanner;

public class Test_08 {

	static int a;
	static long c;
	static double b;
	
	static void avv () {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수(int)를 입력하세요 ");
		int a = scan.nextInt();
		
		System.out.println("정수(long)를 입력하세요");
		long c = scan.nextLong();
		
		System.out.println("실수를 한개 입력하세요");
		double b = scan.nextDouble();
	}
	
	public static void main(String[] args) {
		
		avv();
	}

}
