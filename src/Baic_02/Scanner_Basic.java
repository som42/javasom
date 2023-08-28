package Baic_02;

import java.util.Scanner;

public class Scanner_Basic {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		
		System.out.print("정수를 입력해 주세요 :");
		int n = scanf.nextInt();
		System.out.println("입력하신 숫자는 : " + n);
		
		System.out.print("단어를 입력해 주세요 :");
		String word = scanf.next();
		System.out.println("입력하신 단어는 : " + word);
		
		System.out.print("실수를 입력해 주세요 :");
		double e = scanf.nextFloat();
		System.out.println("입력하신 실수는 :" + e);
		
		System.out.print("문자열을 입력해 주세요 :");
		String o = scanf.next();
		System.out.println("입력하신 문장은 : " + o);
		
		System.out.printf
		(" 입력하신 정수 %d \n, 단어%s \n, 실수%f \n, 문자열%s 입니다"
				, n , word , e , o);
	}
	

}

