// Que:- 5  Write a Java Program that Accepts String Data from User and then Provide options for Changing case into Any of the Following. (UPPERCASE, lowercase, Sentence case, tOGGLE cASE).
import java.util.*;

public class Case_change{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter string : ");
		String data=sc.next();
		
		System.out.print("\nselect one case for given data : ");
		System.out.println("1 . UPPERCASE");
		System.out.println("\t\t\t\t 2 . lowercase");
		System.out.println("\t\t\t\t 3 . Sentence Case");
		System.out.println("\t\t\t\t 4 . tOGGLE cASE");
		System.out.print("\nenter your choice : ");
		int c=sc.nextInt();
		
		switch(c){
			case 1:
				
						System.out.println("\n\ngiven string in UPPERCASE  :  "+ data.toUpperCase());
						break;
				
			case 2:
				
						System.out.println("\n\ngiven string in lowercase  :  "+ data.toLowerCase());
						break;
			default:
						System.out.println("invalid input");
		
		}
	}	
}	