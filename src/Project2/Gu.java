package Project2;

import java.util.Random;
import java.util.Scanner;


public class Gu {

	int x,y,z,i,answer,score,mo;
	Scanner scan = new Scanner(System.in); // 정답을 받아냄
	Random random = new Random(); //랜덤숫자생성

	Gu(){
		System.out.println("구구단 게임 시작!");
		make();

	}

	void make() {
		while(true) {

			i++;
			if(i==6) {}
			else {
				x=random.nextInt(9)+1;
				y=random.nextInt(9)+1;
				answer=x*y; //시스템 정답 저장
				System.out.println(x+"X"+ y +" = ? ");
				z= scan.nextInt(); // 사람이 적은 정답 저장
				if(z==answer) {
					System.out.println("정답입니다");
					score+=20;
					continue;
				}else {
					System.out.println("오답입니다!");

				}
			}


			if(score==100) {
				System.out.println("만점입니다! 대단해요");
			}else {
				System.out.println("최종점수는 100점 만점중에"+
						score+"점입니다\n 아쉽지만 탈락입니다");
			}

			System.out.println("또하시겠습니까? (1/2)");
			mo=scan.nextInt();
			if(mo==1) {
				continue;
			}
			else {
				System.out.println("수고링");
				break;
			}
		}
	}

	public static void main(String[] args) {

		Gu gu = new Gu();


	}

}
