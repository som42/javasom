package Baic_08;

import java.util.Scanner;

public class Test_07 {
	
	static int a;
	
	static void num ( ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하시오 ");
		a = scan.nextInt();
		if( a<0 || a> 120) {
			System.out.println("0~100사이 숫자를 적어주세요");
		}else
			System.out.println("정답");
			
	}

	public static void main(String[] args) {

		num();
	}

}
