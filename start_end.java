//2019 paper 2
import java.util.*;
public class start_end extends Thread{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter string :");
		String str=sc.next();
		
		System.out.println("\nstring is :"+str);
		System.out.print("enter starting character :");
		String start=sc.next();
		System.out.print("enter ending character :");
		String end=sc.next();
		
		System.out.println("\n\nstr.indexOf(start ) + 1 : "+(str.indexOf(start)+1));
		System.out.println("str.indexOf( end) : "+str.indexOf( end));
		
		String subStr = str.substring(str.indexOf(start )+1 , str.indexOf( end));

		System.out.print("\n\nsub string  :  ");
		
		for (int i=0;i<subStr.length();i++){
			System.out.print(subStr.charAt(i));
			try{	Thread.sleep(1000);	}
			catch(Exception e){}
		}
	
	}
}