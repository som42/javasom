package Baic_02;

import java.util.Scanner;

public class Samhang {
	
	void su_func() {
		// 두 수를 입력 받아서 큰 수를 찾아내는 프로그램을 작성하라 (단 같은 경우는 없다)
		Scanner can = new Scanner(System.in);
		String yn;
		while(true)
		{
			System.out.print("숫자 입력 : ");
			int a = can.nextInt();
			System.out.print("숫자 입력 : ");
			int b = can.nextInt();
		
			String result = a>b ? a+"이" + b + "보다 크다 ":  a+"이" + b + "보다 작다 " ;
		
			System.out.println(result);
			System.out.println("도 하실건가요 (y/n) :");
			yn = can.next();
			if(yn.equals("y") ) {
				System.out.print("다시");
				continue;
			}
			else {
				System.out.print("end");
				can.close();
				System.out.print("영업 종료");
				break;
		}
	
	}
 }
	
	public static void main(String[] args) {
		Samhang sam = new Samhang();
		sam.su_func();
		
    }

}