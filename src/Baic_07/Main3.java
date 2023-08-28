package Baic_07;

import java.util.Scanner;

public class Main3 {
	static int input;
	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		Car_Class car_class;
		System.out.println(" 1. 버스 \n 2. 트럭 \n 3. 종료 \n선택하세요");
		while(true){ // 123 다시 누르게 해주는거
			//입력창 띄워주고 
			int input = scanf.nextInt();//입력창받을꺼적어주고 
			
			//1번을 누르면 버스화면 2번을 누르면 트럭하면 조건문을해준다

			if(input == 1) {
				car_class =  new Bus_Class();
				car_class.run();
				
//				break;
			}
			else if (input == 2) {
				car_class = new Tru_Class();
				car_class.run();
			}
			else if ( input == 3 ){
				System.out.println("종료합니다.");
				break;
			}
			System.out.println(" 또 하시겠습니까? (y/n)");
			String in = scanf.next();
			while(true) {
				if (in == "y") {
					System.out.println(" 1. 버스 \n 2. 트럭 \n 3. 종료 \n선택하세요");
					
				}
				else{
					break;
				}

			}
		}
	}

}
class Car_Class{
	String name;
	int speed;
	String color;
	int monoy;
	void run() {
		System.out.printf(" 자동차 종류 : %s \n"
				+ " 자동차 속도 : %d", name,speed);
		System.out.printf(" \n 자동차 색깔 : %s \n"
				+ " 자동차 가격 : %d 만원\n", color,monoy);
	}


}
class Bus_Class extends Car_Class{
	Bus_Class(){
		name="버스";
		speed=60;
		color="화이트";
		monoy=3500;

	}
}
class Tru_Class extends Car_Class{
	Tru_Class(){
		name="트럭";
		speed=100;
		color="블랙";
		monoy=7000;
	}
}