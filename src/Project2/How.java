package Project2;

import java.util.Scanner;

public class How {
	
	static String name = "충히";
	static int count = 0;
	
	static void who () {System.out.println("넌누구니?"); }
	static void iam() {
		System.out.println("난" + (count++)+"번째"+name+"야");
	}
			
	


	public static void main(String[] args) {
		for (int i=0; i<3;i++) {
			who();
			iam();
		}
	
 }
}

