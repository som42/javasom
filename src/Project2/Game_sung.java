package Project2;

import java.util.Scanner;

public class Game_sung  {
	
	
	public static void main(String[] args) {
				
		String name;
		int kor, eng, meth;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 이름을 입력하세요 ");
		name = scan.next();
		
		System.out.println(" 수학점수를 입력하세요");
		kor = scan.nextInt();
		
		System.out.println(" 영어점수를 입력하세요");
		eng = scan.nextInt();
		
		System.out.println(" 국어점수를 입력하세요");
		meth = scan.nextInt();
		
		int i=0,k;
		i = meth + kor + eng;
		k = i/3;
		System.out.println("총합은 : " + i );
		System.out.println("평균은 : " + k );
		if( k>=90) {
			System.out.println("A학점 입니다.");
		}else if (k>=80) {
			System.out.println("B학점 입니다");
		}else if (k>=70) {
			System.out.println("c학점 입니다");
		}else if ( k <= 60) {
			System.out.println("낙제 입니다");
		}
		
		
		
	
	}
	
}



	

	
