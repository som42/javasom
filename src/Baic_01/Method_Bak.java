package Baic_01;

import java.util.Scanner;

public class Method_Bak {
	//내부 클래스 메소드
	//클래스 영역 : 멤버변수, 멤버 함수 
	static void who(){
		System.out.println("넌 누구니?");
	}
	static void iam(int no) {
		Scanner scanf = new Scanner(System.in);
		String name; 
		System.out.printf("이름을 입력하세요 : ");  name= scanf.next();
		
		
		System.out.printf("번호 %d : %s\n 입니다\n",no, name);
		
	}

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			who();
			iam(i+1);
		}
		System.out.println("출썩 체크 끝");
		
			
	
		
		
//		name = scanf.next(); //입력받는거
//		System.out.printf(" %s 입니다", name);
	}

}
