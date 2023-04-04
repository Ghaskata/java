class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
	
}


public class si_il{
	Node start;
	int size=0;
	
	public void insert(int data){
		Node newnode=new Node(data);
		if(start==null){
			start=newnode;
			size++;
			return;
		}
		Node current=start;
		while(current.next!=null){
			current=current.next;
		}
		newnode.next=current.next;
		current.next=newnode;
		size++;
	}
	
	
	public void display(){
		Node current=start;
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		System.out.println("\n-------list is------\n");
		while(current.next!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	
	public void add(int data,int p){
		Node newnode=new Node(data);
		if(p<0&&p>size+1){
			System.out.println("position is out of length");
			return;
		}
		if(p==1){
			newnode.next=start;
			start=newnode;
			return;
		}
		Node current=start;
		for(int i=1;i<p-1;i++){
			current=current.next;
		}
		newnode.next=current.next;
		current.next=newnode;
		
	}
	
	public void delete(int p){
		Node current=start;
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		if(p==1){
			start=start.next;
			return;
		}
			if(p<0&&p>size+1){
			System.out.println("position is out of length");
			return;
		}
		for(int i=1;i<p-1;i++){
			current=current.next;
		}
		current.next=current.next.next;
	}
	
	
	public static void main(String[] args) {
		si_il s=new si_il();
		s.start=null;
		
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.display();
		
		System.out.println("");
		s.add(90,6);
		s.display();
		
		System.out.println("");
		s.insert(50);
		s.display();
		
		System.out.println("");
		s.delete(7);
		s.display();
		
			s.insert(50);
		s.display();
		
		while(true){}
	}
}