package Baic_04;

public class Bak {
	
	/*
	static String name ="난장이";
	static int age = 0;
	static  void who () {
		System.out.println("\n누구닁?");
		
	}
	static void iam() {
		System.out.printf("난" + (age++) + " 번째 %s이야\n", name);	
	} */
	
	String name= "공주님";
	int age = 0;
	
	void fo () {
		System.out.println("\n 넌누구뉭?");
	}
	void foo() {
		System.out.printf(" 난  %d 번째 %s이야" , (++age),name);
	}
	
	
	public static void main(String[] args) {
	/*	for(int i=0; i<3; i++) {
			who();
			iam();
		} */
		
		Bak ins = new Bak();
		for(int i=0; i<3; i++) {
			
			ins.fo();
			ins.foo();
			
		}
		
		
		
	}	
	
}
