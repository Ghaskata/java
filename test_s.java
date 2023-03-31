  // Jvdroid-main: 
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

class test_s{
	Node start;
	
	public void insert(int data){
		Node current=start;
		while(current.next!=null){
			current=current.next;
		}
		Node newnode=new Node(data);
		current.next=newnode;
	}
	
	public void delete(int data){
		if(start.data==data){
			start=start.next;
			return;
		}
		Node current=start;
		while(current.next.data!=data){
			current=current.next;
		}
		current.next=current.next.next;
	}

		public void serch(int data){
			Node current=start;
			int p=0;
			while(current!=null){
				if(current.data==data){
					System.out.println("entered data "+data+" is found at "+p+ " position");
				}
				current=current.next;
				p++;
			}
		}
	
	
	
	public void display()
	{
		Node current=start;
		while(current.next!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String args[]){
		test_s s=new test_s();
		
		System.out.println("\nAdd start\n");
		s.start=new Node(5);		
		s.display();
		System.out.println("\n++++++\n");
		
		System.out.println("\nAdd \n");
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.display();
		System.out.println("\n++++++\n");
		
		
		System.out.println("\ndelete \n");
		s.delete(20);
		s.display();
		System.out.println("\n++++++\n");
		
		
		
		System.out.println("\nserch\n");
		s.serch(40);
		s.display();
		System.out.println("\n++++++\n");
	}
}