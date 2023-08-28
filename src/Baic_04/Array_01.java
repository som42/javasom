package Baic_04;

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
/*	
		String[] str_1 = {"홍길동","김래환","김도형","김래수"};
		
		System.out.println(str_1[0]);
		
		for(i=0; i<3; i++)
			System.out.println(str_1[i]);
			System.out.println("________________");
		
		str_1[1] = "김다솜";
		str_1[3] = "김다솜";
			for(i=0; i<str_1.length; i++)
			System.out.printf("\n[%d] : %s", i ,str_1[i]);
			*/
	/*	
		String[] weeks = {"월","화","수","목","금","토","일"};
		
		for (i=0; i<weeks.length; i++)
			
			System.out.printf("\n[%d] : %s", i , weeks[i]);
		*/
	/*	
		int [] su = {10,20,30,40,50};
		for (i=0; i<su.length; i++)
			System.out.printf("\n[%d] : %s", i , su[i]);
			System.out.printf("\n 점수 갯수는 : "+ su.length);
			*/
	/*	
		String[] name = {"홍길동","이동수","김철수","강수진","최영숙"};
		String [] tel = {"011", "012", "013", "014", "015"};
		int[] all = {10, 20, 30, 40, 50};
		
		for (i=0; i<name.length; i++)
			System.out.printf("\n %d %s %s %d",(i+1),name[i],tel[i],all[i]);
	*/
		
		//입력 횟수를 입력해서 그 횟수 만큼 배열 선언하여 그 곳에 입력된 정수를출력하자
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("몇 개의 점수를 입력 할건가요? :");
		int [] jumsuA = new int [ scanf.nextInt() ];
		int sum=0;
		for(i=0;i<jumsuA.length; i++) {
			System.out.println("\n점수 입력 : ");
			jumsuA[i] =  scanf.nextInt();
			sum+=jumsuA[i]; 
			
		}
		for(i=0; i<jumsuA.length;i++)
			System.out.printf("\n입력 하신 점수는 %d",jumsuA[i]);
		
		
		
		System.out.printf("\n 총합점수는? : %d ",sum);
		
		int avg = sum/jumsuA.length;
		System.out.printf("\n 평균 %d", avg);
	
				
		
	}

}
