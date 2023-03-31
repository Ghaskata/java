// Que:-1   Create STUDENT class having data members roll no and name. Create 5 objects of STUDENT class and take input from the user and print all students’ data in ascending order of name with interval of 1 second


import java.util.*;

public class student extends Thread{	

	//data member
	int rno;
	String name;
	
	//constuctor
	public student(int rno,String name){
	   this.rno=rno;
       this.name = name;
    }
    
	static void printdata(student arr[]){	    	  
		  	for (int i= 0; i < 5; i++)
		 	  {
     				 for (int j = i+1; j < 5 ; j++)
			 			{				
        						String n1=arr[i].name;
        						String n2=arr[j].name;
        						if (n1.compareTo(n2)>0)
        				 		{
         							 student temp = arr[i];
          							arr[i] = arr[j];
          							arr[j] = temp;
        						}
       				 }
        	System.out.println("rno : "+arr[i].rno);
			System.out.println("name : "+arr[i].name);
			System.out.println(" ");
			try{			Thread.sleep(1000);				}	
			catch(Exception e){	System.out.println(e);	}
        
			  }	  		    	  	    	  
		
	}
	

		
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);						
																					
			System.out.println("\n------------enter 5 student detail---------------\n");
			
			student[] s=new student[5];
			
			for(int i=0;i<5;i++){
				
				System.out.print("enter rno : ");
            	int rno= sc.nextInt();
				System.out.print("enter Name : ");
            	String name = sc.next();
            
            	System.out.println("");
            
            	s[i] = new student(rno,name);
            
			}	
			
  

					
			System.out.println("\t----------------------------------------\n \t student data in ascending order of name \n\t----------------------------------------");
			
			student.printdata(s);	
				
						                        
		 
	}
}


    