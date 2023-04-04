//Write a program to sort or arrange the names in alphabetical order.
//Input: Reena , Ankit, Hema
//Output: Ankit, Hema, Reena

import java.util.*;
public class name_arrange_alpha{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter how many name would you arrange  : ");
		int n=sc.nextInt();
		System.out.println("\n-------enter names------");
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		
		System.out.println("\n\n----------names in alphabetical order----------");
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(s[i].toLowerCase().compareTo(s[j].toLowerCase())>0){
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			System.out.println(s[i]);
		}
		
		
	}
}