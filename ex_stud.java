import java.util.*;

class stud{
	int rno;
	String name;
	public stud(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
}

class displaythread extends Thread{
	stud arr[];
	public displaythread(stud s[]){
		arr=s;
	}
	
	public void run(){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				String n1=arr[i].name;
				String n2=arr[j].name;
				if(n1.compareTo(n2)>0){
					stud temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println("\nrno of student : "+arr[i].rno);
		System.out.println("name of student : "+arr[i].name);
		System.out.print(" ");
		try{	Thread.sleep(1000);	}
		catch(Exception e){}
		}
	}
	
}


public class ex_stud{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter no of student : ");
		int n=sc.nextInt();
		
		stud[] s=new stud[n];
		
		for(int i=0;i<n;i++){
			System.out.print("\nenter rno : ");
			int rno=sc.nextInt();
			System.out.print("enter name : ");
			String name=sc.next();
			s[i]=new stud(rno,name);
		}
		
		displaythread t=new displaythread(s);
		t.start();
	}
}