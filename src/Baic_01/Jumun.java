package Baic_01;

import java.util.Scanner;

public class Jumun {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		
		
		int no;
		String ss ="새우", bb="불고기", es="종료";
		System.out.println("메뉴 선택 프로그램");
		System.out.println("1. 새우 햄버거");
		System.out.println("2. 불고기 햄버거");
		System.out.println("3. 종료");
		System.out.println("주문 번호를 입력하세요 : ");
		
		no = scan.nextInt();
		if(no==1)
			System.out.printf("%s 햄버거를 선택했군요", ss);
		else if(no==2)
			System.out.printf("%s 햄버거를 선택했군요", bb);
		if(no==3)
			System.out.printf("주문이"+"%s 끝났습니다", es);
		
		
		
		
	
		
		

	}

}
