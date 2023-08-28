package Baic_01;

public class Money {

	public static void main(String[] args) {
		
		int money = 32345;
		int man, chun, bak, si, w, nam;
		
		man = 32345/10000;
		nam= money - (man*10000);
		System.out.printf("만원 :%d (%d)\n", man, nam);
		
		chun =  nam/1000;
		nam = nam - (chun*1000);
		System.out.printf("천원 :%d (%d)\n", chun, nam);
		
		bak = nam/100;
		nam =  nam -(bak*100);
		System.out.printf("백원 :%d (%d)\n", bak, nam);
		
		si = nam/10;
		nam = nam -(si*10);
		System.out.printf("십원 :%d (%d)\n", si, nam);

		w = nam/1;
		nam = nam - (w*1);
		System.out.printf("일원 :%d (%d)\n", w, nam);
		
	
	}

}