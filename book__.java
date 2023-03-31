// Que:-8   Write a program that accept Book information like Title, Author, Publication and Price for the N book from the user and display books in descending order with interval of 1 second using thread


import java.util.*;

public class book{	

	//data member
	String title,name,author,publication;
	int price;
	
	
	//constuctor
	public book(String title,String author,String publication,int price){
	   this.title=title;
       this.author=author;
       this.publication=publication;
       this.price=price;
    }
    
	class display extends Thread{
			book books[];
			
			display(book arry[]){
				this.books=arry;
			}
			
		public void run(){	   
		
		 	  			
			System.out.println("\t----------------------------------------\n \t books data in descending order of title \n\t----------------------------------------");
		 	   	   	  
		  	for (int i= 0; i < books.length; i++)
		 	  {
     				 for (int j = i+1; j < books.length; j++)
			 			{				
        						String n1=books[i].title;
        						String n2=books[j].title;
        						if (n1.compareTo(n2)<0)
        				 		{
         							 book temp = books[i];
          							books[i] = books[j];
          							books[j] = temp;
        						}
       				 }
        	System.out.println("Title : "+books[i].title);
			System.out.println("Author : "+books[i].author);
			System.out.println("Publication : "+books[i].publication);
			System.out.println("Price : "+books[i].price);
			System.out.println(" ");
			try{			Thread.sleep(1000);				}	
			catch(Exception e){	System.out.println(e);	}
        
			  }	  		    	  	    	  
		
	}
	}
	

		
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);						
																					
			System.out.print("enter how many books detail you want to enter : ");
			int n=sc.nextInt();
			
			
			System.out.println("\n-------------------enter  "+ n +" books detail---------------\n");
			book[] b=new book[n];
			
			for(int i=0;i<n;i++){
				
				System.out.print("enter book title : ");
            	String title= sc.next();
            	System.out.print("enter book author : ");
            	String author = sc.next();
            	System.out.print("enter book publication : ");
            	String publication= sc.next();
            	System.out.print("enter book price : ");
            	int price = sc.nextInt();
            
            	System.out.println("");
            
            	b[i] = new book(title,author,publication,price);
            
			}	
			
  

		
			
			display t=new display(b);
			t.start();
				
						                        
		 
	}
}


    