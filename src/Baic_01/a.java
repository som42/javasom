package Baic_01;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		int su;
		double f;
		String str;
		System.out.print("숫자를 입력 하세요 : ");  su = scanf.nextInt();
		System.out.println("입력한 값 :" + su);
		
		System.out.print("실수를 입력 하세요 :");   f = scanf.nextFloat();
		System.out.println("입력한 값 : "+ f);
		
		System.out.print("\n문자를 입력 하세요 : ");  str = scanf.next();
		System.out.println("입력한 문자열 :" + str);
		
		

	}

}
