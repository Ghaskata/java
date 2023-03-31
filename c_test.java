import java.util.*;

public class c_test{
	
	static class Node{
		int data;
		Node next;
	}
	
  static Node addempty(Node last,int data)
	{
		if(last!=null)
			return last;
		Node newnode=new Node();
		newnode.data=data;
		last=newnode;
		newnode.next=last;
		System.out.println("\ninserted");
		System.out.println("\n----------\n");
		return last;
	}
	
static Node addfont(Node last,int data)
	{
		if(last==null)
			return addempty(last,data);
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		System.out.println("\ninserted");
		System.out.println("\n----------\n");
		return last;
	}	
	
	static Node addend(Node last,int data)
	{
		if(last==null)
			return addempty(last,data);
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		last=newnode;
		System.out.println("\ninserted");
		System.out.println("\n----------\n");
		return last;
	}	
	
	static Node delete(Node last,int data){
		if(last==null){
		System.out.println("\nlist is empty");
		System.out.println("\n----------\n");
		return last;
		}
		if((last.data==data)&&(last.next==last)){
		last=null;
		System.out.println("\ndeleted");
		System.out.println("\n----------\n");
		return last;
		}
		
		Node p=last;
		if(last.data==data){
			while(p.next!=last){
				p=p.next;
			}
			p.next=last.next;
			last=p;
			System.out.println("\ndeleted");
			System.out.println("\n----------\n");
			return last;
		}
		while((p.next!=last)&&(p.next.data!=data)){
			p=p.next;
		}
		if(p.next.data==data){
			p.next=p.next.next;
			System.out.println("\ndeleted");
			System.out.println("\n----------\n");
			return last;
		}
	
		System.out.println("\nnot found");
		System.out.println("\n----------\n");
		return last;
	}
	
	
	
	
	static void display(Node last){
		if (last==null){
		System.out.println("\nlist is empty");
		System.out.println("\n----------\n");
		return;
		}
		Node p=last.next;
		do{ 
		System.out.println("\n"+p.data);
		p=p.next;
		}while(p!=last.next);
		System.out.println("\n----------\n");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		c_test c=new c_test();
		
		Node last=null;
		
		while (true)
		{
			int ch,data;
			System.out.println("1.add to empy");
			System.out.println("2.add to front");
			System.out.println("3.add to end");
			System.out.println("4.delete");
			System.out.println("5.display");
			
	   	System.out.print("\nenter your choice : ");	
			ch=sc.nextInt();
			
			if(ch==1){
					System.out.print("\nenter data: ");	
			data=sc.nextInt();
			last=addempty(last,data);
			}	
			else if(ch==2){
				System.out.print("\nenter data: ");	
			data=sc.nextInt();
			last=addfont(last,data);
			}	
			else if(ch==3){
				System.out.print("\nenter data: ");	
			data=sc.nextInt();
			last=addend(last,data);
			}
			else if(ch==4){
				System.out.print("\nenter data: ");	
			data=sc.nextInt();
			last=delete(last,data);
			}
			else if(ch==5){
			display(last);
			}	
			else{
		System.out.println("\ninvalid enter");
		System.out.println("\n----------\n");
		return;
			}								
																		
		}
		
	}
}