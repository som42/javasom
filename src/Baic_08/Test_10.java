package Baic_08;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Test_10 {

	static	Long ko,em,su;
	static int a,b,e;
	
	static void aee() {
		
	
		while(true) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어를 입력하세요");
		 Long ko = scan.nextLong();
		 
		 System.out.println("영어를 입력하세요");
		 Long em = scan.nextLong();
		 
		 System.out.println("수학를 입력하세요");
		 Long su = scan.nextLong();
		 
		 a =(int) (ko+em+su);
		 b = (int)a/3;
		 
		 System.out.printf("\n총합은 : %d=입니다",a);
		 System.out.printf("\n평균은 : %d 입니다",b);
		 
		 if( b <= 90) {
			 System.out.printf(" /nA학점 입니다");
		 }else if (b <= 80) {
			 System.out.printf(" /nB학점 입니다");
		 }else if (b <= 70) {
			 System.out.printf(" /nc학점 입니다");
		 }else if(b <= 60) {
			 System.out.printf(" /n낙제 입니다");
		 }
		 
		 System.out.println("또 하시겠습니까? (1/2)");
		  e=scan.nextInt();
		  if(e == 1) 
			  continue;
		  else
			  System.out.println("수고하셨습니다");
		  	break;
		  
		}
		
	}



	public static void main(String[] args) {
		aee();
	}
}
