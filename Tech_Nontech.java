//Write a program to input at least 5 records of teaching staff and 5 records of non-teaching staff and display it using inheritance.
import java.util.*;

 class staff extends Thread{
	int no;
	String name;
	public staff(int no,String name){
		this.no=no;
		this.name=name;
	}
	public void display(){
		System.out.println("\nno : "+no);
		System.out.println("name : "+name);
		System.out.println("");
		try{	Thread.sleep(1000);	}
		catch(Exception e){}
	}
}

class teaching extends staff{	
	teaching(int no,String name){
		super(no,name);
	}	
	public void display(){
		super.display();
	}
}

class nonteaching extends staff{
	nonteaching(int no,String name){
		super(no,name);
	}
	public void display(){
		super.display();
	}
}

public class Tech_Nontech{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nenter no of teaching staff : ");
		int tno=sc.nextInt();
		
		System.out.println("\n-------enter teaching staff details----------");
		teaching[] t=new teaching[tno];
		for(int i=0;i<tno;i++){
			System.out.print("\nenter no : ");
			int no=sc.nextInt();
			System.out.print("enter name : ");
			String name=sc.next();
			t[i]=new teaching(no,name);
		}
		
		
		System.out.print("\n\nenter no of Non teaching staff : ");
		int ntno=sc.nextInt();
		nonteaching[] nt=new nonteaching[ntno];
		
		System.out.println("\n-------enter Non teaching staff details----------");
		for(int i=0;i<ntno;i++){
			System.out.print("\nenter no : ");
			int no=sc.nextInt();
			System.out.print("enter name : ");
			String name=sc.next();
			nt[i]=new nonteaching(no,name);
		}
		
		
		System.out.println("\n\n-------teaching staff details----------");
		for(int i=0;i<tno;i++){
			t[i].display();
		}
		
		System.out.println("\n\n-------Non teaching staff details----------");
		for(int i=0;i<ntno;i++){
			nt[i].display();
		}
		
	}
}