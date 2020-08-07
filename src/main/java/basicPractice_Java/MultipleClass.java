package basicPractice_Java;
import java.util.Scanner;

public class MultipleClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecoundClass obj = new SecoundClass();
		System.out.println("Enter your name here :");
		String temp=input.nextLine();
		obj.setName(temp);
		obj.saying();
		
	}

}
