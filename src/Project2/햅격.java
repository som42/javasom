package Project2;

import java.util.Scanner;

public class 햅격 {
	String handle="우회전";
	int ball = 10;
	int rotate = 20;
//	ball =4;
	
	void acr_run() {
		handle = "90도 회전";
		ball = 40;
		System.out.printf("1번 코너에서 %s 하세요 ", handle);
		if(ball < 10)
			System.out.printf("1번 코너에서 %d 회전하세요",rotate);
		else
			System.out.printf("1번 코너에서 %d도 회전하세요",rotate+50);
	}
	
	public static void main(String[] args) {
		햅격 햅격 = new 햅격();
		
		
		
		
	}

}
