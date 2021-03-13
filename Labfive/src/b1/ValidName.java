package b1;
import java.util.Scanner;

class NExcep extends Exception {
	public NExcep(String str) {
		System.out.println(str);
	}
}

public class ValidName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname = sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your last name");
		String lastname = sc1.nextLine();
		
		try {
			if(firstname.isEmpty() )
				throw new NExcep("Enter your first name");
			else if(lastname.isEmpty()) 
				throw new NExcep("Enter your last name");
			else
				System.out.println("Your name is valid");
		}
		
		catch(NExcep e) {
			System.out.println(e);
		}
		
	}

}