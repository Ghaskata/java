//Create the dept-emp mgt system using concept of nested class.

//non static 
import java.util.*;
class dept{
	Scanner sc=new Scanner(System.in);
	int dno;
	String dname;
	public dept(){
		System.out.print("\nenter dno : ");
		this.dno=sc.nextInt();
		System.out.print("enter dname :  ");
		this.dname=sc.next();
	}
	
	class emp{
		int eno,sal;
		String ename;
		public emp(){
			System.out.print("\nenter eno : ");
			this.eno=sc.nextInt();
			System.out.print("enter ename :  ");
			this.ename=sc.next();
			System.out.print("enter sal : ");
			this.sal=sc.nextInt();
		}
		
		public void display(){
			System.out.println("\n dno : "+dno);
			System.out.println("dname :  "+dname);
			System.out.println("eno : "+this.eno);
			System.out.println("ename :  "+this.ename);
			System.out.println("sal : "+this.sal);
		}
	}
	
}

public class dept_empMgt{
	public static void main(String[] args) {
		dept d=new dept();
		dept.emp e=d.new emp();
		e.display();
	}
}