//jump 2 learn

//16. Create 2 classes which contains following details.

//Emp table Dept table

//Empno Deptno

//Empname Deptname

//Esal

//Edesignation 

//Enter atleast 5 records & display report in format & Accept data through user & print it 

//to console.

//Ename Edesignation Deptn


import java.util.*;

class dept{
	int dno;
	String dname;
	
	public dept(int dno,String dname){
		this.dno=dno;
		this.dname=dname;
	}
	
	
}

class emp extends dept{
	int eno,sal;
	String ename,des;
	
	public emp(int dno,String dname,int eno,String ename,int sal,String des){
		super(dno,dname);
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.des=des;
	}
	
		void printdata(){
			
			System.out.println(ename+"        "+des+"           "+dno+"         "+sal);
		}
	
}

class jump_16{		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nenter No of employee : ");
		int n=sc.nextInt();
		
		emp[] e=new emp[n];
		
		
		
		for(int i=0;i<n;i++){
		
		System.out.print("\nenter department no : ");
		int dno=sc.nextInt();
		
		System.out.print("enter department name : ");
		String dname=sc.next();
		
		System.out.print("enter employee no : ");
		int eno=sc.nextInt();
		
		System.out.print("enter employee name : ");
		String ename=sc.next();
		
		System.out.print("enter employee salary : ");
		int sal=sc.nextInt();
		
		System.out.print("enter empolyee designation : ");
		String des=sc.next();
			
		e[i]=new emp(dno,dname,eno,ename,sal,des);
		System.out.println("\n ---------------\n");
		}
		
	    System.out.println("\n\n-----------------------------------------------");
		System.out.println("ename   designation     deptno         sal" );
		System.out.println("-----------------------------------------------");
		for(int i=0;i<n;i++){
		e[i].printdata();
		}
		
	}
}