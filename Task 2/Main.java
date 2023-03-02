//Task 2
import java.util.Scanner;

class Main{
	//private static int retire = 67;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type your name");
		String input = scan.nextLine();
		System.out.println("Hi " + input);

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please type your age");
		int input1 = scan1.nextInt();

		//retire = 67 - input1;

		System.out.println("You will retire in " + (67 - input1) + " years");


	
	}
	

}