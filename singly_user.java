import java.util.*;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}


public class singly_user{
	Node start;
	
	public void insert(int data){
		Node current=start;		
		while(current.next!=null){
			current=current.next;
		}
		Node newnode=new Node(data);
		current.next=newnode;
		System.out.println("\n"+data +"  inserted");
		System.out.println("\n-------------\n");
	}
	
	public void display(){
		Node current=start;
		while(current.next!=null){
			System.out.println("\n "+current.data);
			current=current.next;
		}
		System.out.println("\n "+current.data);
		System.out.println("\n-------------\n");
	}
	
	
	public void delete(int data){
		if(data==start.data){
			start=start.next;
			System.out.println("\ndata "+data+" is deleted");
			System.out.println("\n-------------\n");
			return;
		}
		Node current=start;
		while(current.next.data!=data){
			current=current.next;
		}
		current.next=current.next.next;
		System.out.println("\ndata "+data+" is deleted");
		System.out.println("\n-------------\n");
	}
	
	public void serch(int data){
		int p=0;
		Node current=start;
		while(current!=null){
			if(current.data==data){
				System.out.println("\ndata "+data+" is found at "+p+" position");
				System.out.println("\n-------------\n");
				return;
			}
			current=current.next;
			p++;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		singly_user s=new singly_user();
		
		System.out.print(" enter start in your list :");
		s.start=new Node(sc.nextInt());
		System.out.println("\n-------------\n");
		
		while(true){
			int c,data;
			System.out.println("1.insert");
			System.out.println("2.delete");
			System.out.println("3.serch");
			System.out.println("4.display");	
			
			System.out.print("\nenter your choice : ");				c=sc.nextInt();
			
			if(c==1){ 
			System.out.print("\nenter data for insert :");
				data=sc.nextInt();
				s.insert(data);
			}
			else if(c==2){ 
			System.out.print("\nenter data for delete :");
				data=sc.nextInt();
				s.delete(data);
			}
			else if(c==3){
			System.out.print("\nenter data for serch :");
				data=sc.nextInt();
				s.serch(data);
			}
			else if(c==4){ 
				s.display();
			}
			else{
				System.out.println("\n invalid ");
				System.out.println("\n-------------\n");
				return;
			}
		}
	}
}