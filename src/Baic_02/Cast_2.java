package Baic_02;

import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

public class Cast_2 {

	public static void main(String[] args) {
/*		
		char c1, c2;
		c1 = 'A';  c2 ='홍';
		System.out.printf("영문자 %c, 한글 %c", c1, c2);
		System.out.printf("\n영문자 A를 숫자로 %d, 한글 홍을 숫자로 %d", (int)c1, (int)c2);
*/	
	/*	Scanner scanf =  new Scanner(System.in);
		String ch;
		for(int i=1; i<130; i++) {
			
			
			
			if (i%10 ==0) {
				System.out.println("\n--------------more");
				ch = scanf.nextLine();
				if( ch.equals(""))
					continue;
				else 
					break;
				
				
			}
		}*/
//		String str = "abcd";        //문자열은 배열(데이터를 순서대로 기억하는 기억장소)
		
//		System.out.printf("문자열 : %s  %c", str, str.charAt(0));
//		for(int i=0; i<str.length(); i++) {
//			System.out.printf("\n[%d] %c", (i+1) ,str.charAt( i ) ) ;
//		}
	
		//3단 구구단
//		
//		for(int i=1; i<10; i++) {
//			
//			System.out.println(" 3 * " + i + " = " + 3*i );
		
		//구구단 입력하고 다시 하고 끝내기
//		Scanner scanf = new Scanner(System.in);
//		int dan;
//		String sr;
//		while(true)
//		{
//			System.out.println("입력");
//			dan = scanf.nextInt();
//			for(int i=1; i<10; i++) {
//			
//			System.out.printf("\n%d * %d = %d" ,dan,i, dan*i);
//		
//			}
//			System.out.println("\ny를 누르면 다시합니다");
//			sr = scanf.next();
//		
//			if(sr.equals("y")) {
//				continue;
//			}
//			else
//				System.out.print("끝납니다");
//				break;
//			
//		}
		
		//영문자만 입력 가능하고 그 외의 문자는 "다시 입력하세요"
		
		Scanner id = new Scanner(System.in);
		String str;
		
		System.out.println("아이디를 입력하세요");
		str =  id.next();
		
		System.out.printf("입력된 문자열 %s", str);
		for(int i=0; i<str.length(); i++) {
			System.out.printf("[%d] 문자 : [%c] \n ", (int)str.charAt(i), str.charAt(i) );
			if ( (int)str.charAt(i) >= 65 || (int)str.charAt(i) <= 91 && 
					(int)str.charAt(i) <= 97 ||(int)str.charAt(i) <= 122 );
				System.out.println("ok");
//			else {
//				
//				System.out.println("no");
//			}
//	
				
				
		}
		
	
	}
}
