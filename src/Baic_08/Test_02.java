package Baic_08;

public class Test_02 {
	
	int money = 65430;
	int man, chun, bak, si, nam;
	
	void calc() {
	
	
	System.out.printf("원금 %d원은 각 화폐 단위로 표시하세요",money);
	
	
	man = money/10000;
	money -= (man*10000);
	
	chun = money/1000;
	money -= (chun*1000);
	
	bak = money/100;
	money -= (bak*100);
	
	si = money/10;
	money -= (si*10);
	
	nam = money/1;
	money -= (nam*1);
	
	System.out.printf("\n 만원 : %d \n 천원 : %d \n 백원 : %d \n"
			+ " 십원 : %d \n 원 : %d \n",man,chun,bak,si,nam);
	}

	public static void main(String[] args) {

		Test_02 ccc = new Test_02 ();
		ccc.calc();
 }
}