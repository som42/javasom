package Baic_03;

import java.util.Scanner;

import Baic_01.a;

public class Sung {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  kor, eng, mat;
		float sum, avg;
		String hap, hak, yn;
		
		while(true)
		{
		System.out.printf("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.printf("영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.printf("수학 점수 : ");
		mat = sc.nextInt();
		
		sum = kor+eng+mat;
		System.out.printf("총점 : %.1f",sum);
						
		avg = sum/3;
		System.out.printf("\n평균 : %.2f", avg);
		
		hap = avg>=60 ? "합격" : "불합격";
		System.out.printf("\n결과 : %s", hap);
		
		if ( avg>=90 ) hak = "수";
		else if ( avg>=80 ) hak = "우";
		else if ( avg>=70 ) hak = "미";
		else if ( avg>=60 ) hak = "양";
		else  			    hak = "가";
		
		System.out.printf("\n평균학점 : %s"+"\n", hak);
		
		System.out.println("한번더(Y/N) :");
		yn = sc.next();
		if (yn.equals("y")) {
			System.out.println("제대로 입력하세요 \n ----------------------");
			continue; 
		}
		else {
			System.out.println("수고링");
			break; 
		}
		
		
	  }
		
	}

}
