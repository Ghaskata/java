//2019 prac=3
import java.util.*;

class student extends Thread{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	public student(){
		System.out.print("\nenter name : ");
		this.name=sc.next();
		System.out.print("enter  age : ");
		this.age=sc.nextInt();
		System.out.println(" ");
	}
	
	static void sortdata(student arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			String s1=arr[i].name;
			String s2=arr[j].name;
			if(s1.compareTo(s2)<0){
				student temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
			
			
		}
	}
	
	public void printdata(){
		System.out.println("name : "+name);
			System.out.println("age : "+age);
			System.out.println(" ");
	}

	
}

public class stud extends Thread{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter  no of : ");
		int n=sc.nextInt();
		student[] s=new student[n];
		
		for(int i=0;i<n;i++){
				s[i]=new student();
		}
		
		student.sortdata(s);
			
			
			for(int i=0;i<n;i++){
			s[i].printdata();
				try{			Thread.sleep(1000);				}	
			catch(Exception e){	System.out.println(e);	}
		}
		
	}
}