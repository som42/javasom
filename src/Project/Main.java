package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		First_Screen first_Screen =  new First_Screen();
		first_Screen.first_mode();
		
		Input_Screen input_screen =  new Input_Screen();
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		
		
		if ( no == 1) {
			input_screen.input_mode();
		}
		sc.close();
	
		
		
	
	}

}
