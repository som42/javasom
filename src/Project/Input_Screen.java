package Project;

import java.util.Scanner;

public class Input_Screen {
	String name;
	String tel;
	int age;
	int su_number;
	
	static String[] nameA = new String[3];
	static String[] telA = new String[3];
	static int[] ageA = new int[3];
	
	static int count=0;
	
	Scanner sc = new Scanner(System.in);
	
	void input_name() {	
		System.out.print("1.이름 :");
		name = sc.next();
	}
	
	void input_tel() {
		System.out.print("2.전화 :");
		tel = sc.next();
	}
	
	void input_age() {
		System.out.print("3.나이 :");
		age = sc.nextInt();
	}
	
	void input_mode() {
		
	
		System.out.println("==입력 화면 입니다==");
		input_name();
		input_tel();
		input_age();
		
		System.out.println("4.수정할 번호");
		su_number = sc.nextInt();
		
	    System.out.println("5.저장하기");
		
		System.out.println("작업 번호를 선택 하세요 : ");
		
		if(su_number == 1) {
			System.out.println("이름을 수정하시겠습니까?");	
			input_name();
		} else if (su_number == 2) {
			System.out.println("전화번호를 수정하겠습니까?");
			input_tel();
		} else if (su_number == 3) {
			System.out.println("나이를 수정하시겠습니까?");
			input_age();
		} else if (su_number == 5) {
			nameA[count]= name;
			telA[count]= tel;
			ageA[count]= age;
			System.out.println(nameA[count]+","+telA[count]+ ageA[count]);
			
		}
		 
	
			
	}
	
		
	



 }

