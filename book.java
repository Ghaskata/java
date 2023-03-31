// Que:-8   Write a program that accept Book information like Title, Author, Publication and Price for the N book from the user and display books in descending order with interval of 1 second using thread


import java.util.*;

public class book extends Thread{	

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
    
	static void printdata(book arr[],int index){	    	  
		  	for (int i= 0; i < index; i++)
		 	  {
     				 for (int j = i+1; j < index ; j++)
			 			{				
        						String n1=arr[i].title;
        						String n2=arr[j].title;
        						if (n1.compareTo(n2)<0)
        				 		{
         							 book temp = arr[i];
          							arr[i] = arr[j];
          							arr[j] = temp;
        						}
       				 }
        	System.out.println("Title : "+arr[i].title);
			System.out.println("Author : "+arr[i].author);
			System.out.println("Publication : "+arr[i].publication);
			System.out.println("Price : "+arr[i].price);
			System.out.println(" ");
			try{			Thread.sleep(1000);				}	
			catch(Exception e){	System.out.println(e);	}
        
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
			
  

					
			System.out.println("\t----------------------------------------\n \t books data in descending order of title \n\t----------------------------------------");
			
			book.printdata(b,n);	//becaue static method so printdata(b,n); work
				
						                        
		 
	}
}


    