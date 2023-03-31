class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
		}
}


public class Singl_list_test extends Thread{
	Node start;
	
	public void insert(int data){
		Node current=start;
		while(current.next!=null){
			current=current.next;
		}
		Node newnode=new Node(data);
		current.next=newnode;
		System.out.println("inserted  =  "+data+"\n");
	}
	
	
	public void display(){
		Node current=start;
		try{
		while(current.next!=null){
			System.out.println(current.data);
			Thread.sleep(600);
			current=current.next;
		}
		Thread.sleep(300);
		System.out.println(current.data);
		}
		catch (Exception e){System.out.println("error");}
	}
	
	
	public void delete(int data){
		if(data==start.data){
			start=start.next;
			return;
		}
		Node current =start;
		while(current.next.data!=data){
			current=current.next;
		}
		current.next=current.next.next;
		System.out.println("\ndeleled  :  "+data+"\n");
	}
	
	
	public void search(int data){
		Node current=start;
		int position=0;
	
		while(current!=null){
			if(current.data==data){
				System.out.println("\nyour entered data "+data+" found at "+position+" position");
			}
			current=current.next;
			position++;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		try{
		Singl_list_test s=new Singl_list_test();
		s.start=new Node(5);
		System.out.println("\n---> after add start :\n");
		s.display();
		System.out.println("\n••••••••••••••••\n");
		
		Thread.sleep(800);
		System.out.println("\n---> after insert :\n");
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.display();
		System.out.println("\n••••••••••••••••••\n");
		
		Thread.sleep(800);
		System.out.println("\n---> after delete:\n");
		s.delete(30);		
		s.display();
		System.out.println("\n••••••••••••••••••\n");
		
		Thread.sleep(800);
		System.out.println("\n---> serch operation \n");
		s.search(40);
		System.out.println("\n••••••••••••••••••\n");
		
		}		
		catch(Exception e){
			System.out.println("main error");
			}
	}
}