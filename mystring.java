//2019 prac paper que=2a

//reverse
//title case
//n character from right end
//  ===== workable===   right 

import java.io.*;
import java.util.*;

public class mystring{
	public static void main(String[] args)throws  Exception{
		Scanner sc=new Scanner(System.in);
	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter string : ");
	//	String str=br.readLine();
//	String str="ratjk fYsg";
String str=sc.nextLine();
		
		
		//StringBuffer is build in class
		StringBuffer s = new StringBuffer();

 	   s.append(str);

		System.out.println("\n\norignal string : "+s);
		
		//reverse()		
		s.reverse();
		System.out.println("\n\nreverse string : "+s);
		s.reverse();
		
		//title case

	String[] words = str.split(" ");
     for(int i = 0; i< words.length; i++){
 
        words[i] = Character.toUpperCase(words[i].charAt(0))+words[i].substring(1).toLowerCase();
     }

    String out = "";
    for(int i = 0; i<words.length; i++){
       out += words[i] + " ";
    }
 
		
	System.out.println("\n\ntitlecase string : "+out);

	
		//n char from right end
		System.out.println("\n\nenter no of char from right end : ");
		int n=sc.nextInt();
      int initial = str.length()-n;
      for(int i=initial; i<str.length(); i++) {
         System.out.print(str.charAt(i));
      }
	}
}