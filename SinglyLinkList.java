
class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
	
}
public class  SinglyLinkList{
	
	Node start;
	
	
	public void insert(int data){
		Node current=start;
		while(current.next!=null){
			current=current.next;
		}
		Node newnode=new Node(data);
		current.next=newnode;
	}
	
	
	public void print(){
		Node current=start;
		while(current.next!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
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
		System.out.println("node deleted="+current.data);
	}
	
	
	public void search(int data){
		Node current=start;
		int position=0;
		while(current!=null){
			if(current.data==data)
					System.out.println("position of search node "+current.data+ "is : "+Integer.toString(position));
					
			current=current.next;
			position++;
		}
	}
	
	
	public static void main(String[] args) {
		SinglyLinkList s=new SinglyLinkList();
		s.start=new Node(5);
		
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		
		s.print();
		
		s.delete(30);
		System.out.println("after delete 30:");
		s.print();
		
		s.search(40);
		
	}
	
}