import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
	/*	// 
		int jumsu = 10;
		
		if(jumsu >=90) {
			System.out.println("90점보다 높네요");
			System.out.println("A등급 입니다");	
	 }
		else if(jumsu >=80) {
			System.out.println("80점보다 낮네요");
			System.out.println("B등급 입니다");
		}
		else if(jumsu >=70) {
			System.out.println("70점이네요");
			System.out.println("C등급 입니다");
		}
		else{
			System.out.println("F 학점이네요");
			System.out.println("탈락");
		} */
		/*
		int num = (int)(Math.random()*10)  + 1;
		System.out.printf("랜덤 숫자 : %d 당첨 축하드립니다", num);
		
		//1~45 숫자 중 6개 만들어서 출력하라
		
		for(int i=1; i<=6; i++) {
			num =(int)(Math.random()*45)+ 1;
			System.out.printf("\n로또 : %d 번", num);
			
		}
		System.out.printf("\n축하드립니다"); */
	/*	int no=3;
		switch ( no ){
		case 0 : System.out.println(" 0을 좋아하는 군요"); break;
		case 1 : System.out.println(" 1을 좋아하는 군요"); break;
		case 2 : System.out.println(" 2을 좋아하는 군요"); break;
		case 3 : System.out.println(" 3을 좋아하는 군요"); break;
		default : System.out.println("3보다 큰 수를 좋아하는 군요");
	} */

		//정수를 입력하는데 1~3 사이의 숫자를 입력하라 그외에 숫자는 "오류"를 출력하고 끝내라
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int no = sc.nextInt();
		if( no<1 || no>3 ) {
		
			System.out.printf("앗! %d 1보다 작거나 3보다 크면 안돼요", no); 
			}
			else {
				System.out.printf("입력한 숫자는"+ no + "입니다");
			}
		*/
	/*	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력 하세요 : ");
		int no = sc.nextInt();
		
		switch (no) {
		 case 0 :System.out.println("0을 선택하셨군요 신생아");break;
		 case 1 :System.out.println("1을 선택하셨군요 초보");break;
		 case 2 :System.out.println("2을 선택하셨군요 중급");break;
		 case 3 :System.out.println("3을 선택하셨군요 고급");break;
		 case 4 :System.out.println("4을 선택하셨군요 하늘나라");break;
		}
		*/
		// 점수를 이벽받아서 90점 이상은 최우수, 80 이상은 우수, 70이상은 보통 그외는
		//아쉽네요 출력하는 switch 사용한 프로그램을 작성하시오
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요(반드시 정수만) ");
		double no = sc.nextDouble();
		int num = (int)no;
		
		switch (num/10) {
		case 10 : System.out.println(" 최우수");break;
		case 9 : System.out.println(" 우수");break;
		case 8 : System.out.println(" 보통");break;
		default  : System.out.println("이하네요 재시험");
		}
		*/
		// 숫자를 입력 받아서 짝수 이면 "짝짝짝 박수", 홀수이면 "홀홀홀" 출력을
		//switch 사용해서 프로그램을 작성하시오 
	/*	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수만)");
		int no = sc.nextInt();
	
		
		switch (no%2) {
		case 0 : System.out.println(" 짝짝짝 박수");break;
		case 1 : System.out.println(" 홀홀홀 ");break;
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A~E 클래스를 적어주시오");
		
		char c = 'b';
		
		switch ( c ) {
		 
		}
		
	}
}
