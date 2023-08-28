package Baic_05;

public class Constr_person {

	public static void main(String[] args) {
		Per per = new Per("김래환",50,"똥개");
		Ber ber = new Ber("김도현",70,"충이");
		System.out.printf("\n이름뭐라고했노?");
		ber.name_func();
		
	}

}
class Per {
	String neme;
	int age;
	String jop;
	
	Per(String name, int age, String jop){
		this.neme =  name;
		this.age =  age;
		this.jop = jop;
		System.out.printf("이름 :%s, 나이: %d, 직업: %s"
						 ,neme,age,jop);	
	}
	void name_1() {
		
	}
	
}
class Ber{
	String name;
	int age;
	String jop;
	
	Ber(String name, int age, String jop){
		this.name = name;
		this.age = age;
		this.jop = jop;
		System.out.printf("\n이름 :%s, 나이: %d, 직업 :%s"
							,name,age,jop);
		
	}
	void name_func() {
		System.out.printf("\n내이름은 %s",name,"입니다");
		
	}
}
