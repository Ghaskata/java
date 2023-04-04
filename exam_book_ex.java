//paractical paper 2017

//Design a class named Book with data members like ISBN_NO, Title, Publisher and Price. Define dynamic constructor and a member function to displays only books whose title contains "Java programming". Write a program which creates N object of Book class and call appropriate member function.
import java.util.*;

class book{
	int bno,price;
	String pub,title;
	
	public book(int bno,String title,String pub,int price){
		this.bno=bno;
		this.title=title;
		this.pub=pub;
		this.price=price;
	}
	
	public void title_java(){
		String s=this.title;
		if(s.equalsIgnoreCase("Java programming")){
			System.out.println(this.bno+"        "+this.title+"       "+this.pub+"        "+this.price);
		}
	}
}

public class exam_book_ex extends Thread{
	public static void main(String[] args) {
		try{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of books : ");
		int n=sc.nextInt();
		
		book b[]=new book[n];
		for(int i=0;i<n;i++){
			System.out.print("\nenter book no : ");
			int bno=sc.nextInt();
			System.out.print("enter book title : ");
			sc.nextLine();
			String title=sc.nextLine();
			System.out.print("enter book publisher : ");
			String pub=sc.nextLine();
			System.out.print("enter book price : ");
			int price=sc.nextInt();
			System.out.println("");
			b[i]=new book(bno,title,pub,price);
		}
	
		System.out.println("\n\n=====books whose title contains 'Java programming'======\n");
	
		System.out.println("bno      title               pub           price");
		System.out.println("---------------------------------------------------------");
		for(int i=0;i<n;i++){
			b[i].title_java();
			Thread.sleep(1000);
		}
	}
	catch(Exception e){
		System.out.println(e);
		}	
		
	}
}