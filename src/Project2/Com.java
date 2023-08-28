package Project2;

import java.awt.Container;
import java.util.Scanner;

public class Com {
	
	void make () {
		Scanner scan = new Scanner(System.in);
		
		int com, in, count=0, mo;
		System.out.println("숫자 게임");
		com = (int)(Math.random()*100+1);
		System.out.println("컴퓨터 정답 : " + com);
		
		while (true) {
		
		
		for (int i=0; i<10; i++) {
			System.out.println("숫자 입력 : ");
			in = scan.nextInt();
			System.out.println((i+1) + "번째입력 :" + in +" 답 :" + com);
			
			
			if(com==in) {
				
			  System.out.println("정답입니다");
			  		break;
			}
			else if (in>com) {
				if(i ==9) {
					System.out.println("탈락");
					break;
				}
				System.out.println("적으신 숫자보다 작습니다");
				}
			else{
				if(i ==9) {
					System.out.println("탈락");
					break;
				}
				System.out.println("적으신 숫자보다 큽니다");
				}
			
				
			
		}
		
		
		System.out.println("또 하시겠습니까? (1/2)");
		mo = scan.nextInt();
		if(mo==1) {
			
			
			continue;
		}
		else {
			System.out.println("수고하셨습니다");
			break;
		}
		
		}
		
		
	}


	public static void main(String[] args) {
			
		Com com = new Com();
		com.make();
		
	}

}
