// Que:-3  Write a Java Program that accepts string data. Extract either All Vowels or All Non-Vowels from given Data According to Options Selection. Also Provide an Option to Display Output in Uppercase or Lowercase

import java.util.*;

public class Vowel_Consonant{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter string : ");
		String data=sc.next();
		
		String vowels = "", consonants = "";
		
		data=data.toLowerCase();		
		for(int i = 0; i < data.length(); i++) {			
			if(data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o' || data.charAt(i) == 'u' ) {
				vowels += data.charAt(i);
			} else {
				consonants += data.charAt(i);
			}
		} 
		System.out.println("vowels : "+vowels);
		System.out.println("consonants : "+consonants);
		
		System.out.print("\nwhat you want to see from given data  : ");
		System.out.println("1 . vowels ");
		System.out.println("\t\t\t\t\t2 . non vowels");
		System.out.print("enter your choice : ");
		int c=sc.nextInt();
		System.out.println("\n====================== ");
		System.out.print("\nchose upper case or lower case : ");
		System.out.println("1 . uppercase ");
		System.out.println("\t\t\t\t 2 . lowercase ");
		System.out.print("enter your choice : ");
		int ul=sc.nextInt();
		System.out.println("\n ================== ");
		
		switch(c){
			case 1:
				
					if(ul==1){
						System.out.println("vowels in uppercase : "+vowels.toUpperCase());
					}				
					else{
						System.out.println("vowels in lowercase : "+vowels.toLowerCase());
					}
			break;
				
			case 2:
				
				
					if(ul==1){
						System.out.println("nonvowels in uppercase : "+consonants.toUpperCase());
					}
					else{
						System.out.println("nonvowels in uppercase : "+consonants.toLowerCase());
					}
				
			break;
			default:
					System.out.println("invalid input");
		
		}
		
		
		
		
		
	

}
}