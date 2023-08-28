package Project2;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
	
		int jumA[][] = new int [10][10];
		int jumsu, cnt=0;
		int su, moksu,i,j;
		String[] mokA = {"","국어","영어","수학","과학","체육"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명 을 입력하겠습니까?");
		su =sc.nextInt();
		
		System.out.print("몇 과목 입력 할건가요? :");
		moksu = sc.nextInt();
		
		for(i=1; i<=su; i++) {
			cnt++;
			for(j=1; j<=moksu; j++) {
				System.out.print("\n" + cnt +"번 "+mokA[j] + " 점수 : ");
				jumsu=sc.nextInt();
				jumA[i][j] =jumsu;
			}
		
		}
		System.out.println("--------------------------");
		for(i=1; i<=su; i++) {
			System.out.print(i + "번 " );
			for(j=1; j<=(moksu+2); j++) {
				System.out.print( jumA[i][j] + "   ");
			}
			System.out.println();
		}
   }
}