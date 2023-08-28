package Baic_03;

import java.util.Scanner;

public class For_While {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++)
//			System.out.printf("\n[ %d번 ] 입니다.", i);

//			1~100까지 합을 구하라 
		// 누적 연산은 초기화 해야 한다. 누적연산이란 똑같은 변수를 2번이상 쓸때
		// 누적연산 예
	
//		int sum=0, even=0, odd=0, i=1;
//		for ( i=1; i<=100; i++) {ㅑ
//			if(i%2 == 0)
//				even += i;
//			else 
//				odd += i;
//			
//			 sum+=i;  
//		}
//		System.out.printf("1~100까지 합은 : %d \n",sum);
//		System.out.printf("1~100까지 짝수 합은 : %d \n",even);
//		System.out.printf("1~100까지 홀수 합은 : %d ",odd);
		
		//구구단 3단
			
//		int i;
//		for(i=3; i<10; i++) {
//			System.out.printf("\n 3 * %d = %d",i , 3*i);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int i, sum, add;
//		System.out.println("원하시는 구구단을 입력하세요 :");
//		add = sc.nextInt();
//		for (i=1; i<10; i++) {
//			sum = add*i;
//			System.out.printf("\n %d * %d = %d", add,i, sum);
//		
//		int i, j;
//		for ( i=1; i<=9; i++) {
//			for ( j=2; j<=9; j++) {
//				System.out.printf("%2d * %2d = %2d \t", j, i, j*i);
//		}
//			System.out.println();
//		}

	/*	
		int count=0;
		while (count < 5) {
			count++;
			System.out.printf("\n 아직도 작네... %d", count);
		} */
		
//		int count=0;
//		while ( count < 500) {
//			if (count > 5)
//				break;
//			else
//				count++;
//			
//			System.out.printf("\n아직도 크네... %d", count);
//		}
		
//		int count=0;
//		while (true) {
//			if (count > 5)
//				break;
//			else
//				count++;
//			
//			System.out.printf("\n아직도 크네... %d", count);
//		}
		
		//예제 while-3 또 할거니(y/n)? n이면 종료하는 프로그램을 작성하라
		Scanner scanf = new Scanner(System.in);
		
		String str;
		int  count=0;
		
		while (true) {
			count++;
			System.out.printf("\n언제끝나노? %d", count);
			System.out.println("\n 또보고싶으면 (Y/N) :");
			str = scanf.nextLine();
			
			if ( str. equals("y")) {
				System.out.printf("또 할려고욧?");
				continue;}
			else {
				System.out.println("종료");
				break;
			}
			
			
		}
		
	}
}
