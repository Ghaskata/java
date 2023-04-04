class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class singly{
	Node start;
	
	public void insert(int data){
		if(start==null){
			Node newnode=new Node(data);
			start=newnode;
			System.out.println(data+" is inserted");
			return;
		}
		Node current=start;
		while(current.next!=null){
			current=current.next;
		}
		Node newnode=new Node(data);
		current.next=newnode;
		System.out.println(data+" is inserted");		
	}
	
	public void display(){
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		Node current=start;
		while(current.next!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	
	public void delete(int data){
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		if(data==start.data){
			start=start.next;
			System.out.println(data+" is deleted\n");
		}
		Node current=start;
		while(current.next.data!=data&&current.next.next!=null){
			current=current.next;
		}
		if(current.next.next==null&&current.next.data!=data){
		System.out.println(data+" is not found\n");	
		return;
		}
		current.next=current.next.next;
		System.out.println(data+" is deleted\n");		
	}
	
	public void serch(int data){
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		Node current=start;
		int p=0;
		while(current!=null){
			if(data==current.data){
			System.out.println(data+" is found in "+p+"  position\n");
			return;
			}
			p++;
			current=current.next;
		}
	}
	
	
		public void add(int data,int po){
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		Node current=start;
		int p=0;
		do{
			
			if(p==po){				
				Node newnode =new Node(data);
				
				if(current==start){
					System.out.println("++++");
					newnode.next=start;
					start=newnode;
				}
			else{
				newnode.next=current.next;
				current.next=newnode;
				}
				
			}
				
			p=p+1;
			current=current.next;
		}while(current.next!=null);
		
		
	}
	
	
	public static void main(String[] args) {
		singly s=new singly();
		s.start=null;
		s.display();
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.display();
		System.out.println("");
		s.delete(60);
		s.display();
		
		System.out.println("");
		s.serch(30);
		s.display();
		System.out.println("");
		s.add(90,4);
		s.display();
	}
}