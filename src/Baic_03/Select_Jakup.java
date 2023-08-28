package Baic_03;

import java.util.Scanner;

public class Select_Jakup {
	
	static void input_screen() {
		Scanner scnf = new Scanner(System.in);
		String sang;
		System.out.println("입력 화면 입니다.");
		System.out.print("1. 상품명 : ");
		System.out.print("2. 규격 : 32");
		System.out.print("2. 모델 : QLED");
		sang = scnf.next();
		System.out.println("1."+sang+"2.규격 :32"+"모델");
		
	  	
		
	}
	static void search_screen() {
		
	  	System.out.println("조회 화면 입니다.");
	  	
	  
	}
	
	
	public static void main(String[] args) {
	
		Scanner scnf = new Scanner(System.in);
	
		int no;
		String yn;
	
	
	
		System.out.println("엘지 프로그램 화면");
		System.out.println("1. 입력");
		System.out.println("2. 조회");
		System.out.println("3. 수정");
		System.out.println("4. 출력");
		System.out.println("5. 종료");
		System.out.println("작업 번호 1~5번중 눌러주세요 :");
	
		no= scnf.nextInt();
	
		switch (no) { // no는 숫자, 문자, 수식 : (int)(54/10); ==> 결과 5
			case 1: {	
//				scnf.close();
				input_screen();
			}break;
	    
			case 2:{
				search_screen();
				
					
			}break;
			case 3:{
				System.out.println("수정 화면 입니다."); 
			}break;
			case 4:{
				System.out.println("출력 화면 입니다."); 
			}
			case 5:{
				System.out.println("종료 화면 입니다."); 
			}break;
			default : System.out.println("선택 번호를 확인후 입력");
			
		
			}
		
		
		
	 }
	

}
