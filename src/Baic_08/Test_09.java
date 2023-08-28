package Baic_08;

import java.util.Scanner;

public class Test_09 {
	
	int no;
	char ch;
	
	 void scc() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자하나입력 : ");
		ch = scan.nextLine().charAt(0);
		int no = (int)ch;
		
		
		
		System.out.printf("입력한 문자 : %c", ch);
		System.out.printf("입력한 문자 : %d", (int)ch);
		
		for(int i =65; i<122; i++) {
			System.out.printf("\n[%d]숫자 : %c\n",i,(char)i);
				//i는 숫자데 문자로 바꿔라~~~~~~~
		}

	}

	public static void main(String[] args) {
		
		Test_09  ba = new Test_09 ();
		ba.scc();
		
		
	}

}
