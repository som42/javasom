package Baic_05;

import java.util.Scanner;

public class Search_Array {

	
	String[] nameA = {"김루","김산","김신","김해","김달"};
	int[] ageA = {10,20,30,40,50};
	String[] telA = {"010-4545-3657","010-8795-6584",
	 "010-1567-5462","010-1689-5123","010-1684-5137"};
	
	int i, conut=0;
	String a;

	
	
	void line() {
		System.out.println("------------------------");
	}
	void Search_print() {
		System.out.println("데이터 출력");
		line();
		System.out.println("이름     나이     전화");
		line();
		
		for(i=0; i<nameA.length;i++) {
			System.out.println(nameA[i] + "\t" +
							ageA[i]+"\t"+ telA[i]);		
		}
		
	}
}
