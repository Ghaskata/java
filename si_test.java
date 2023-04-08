class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class si_test{
	Node start;
	int size=0;
	
	public void insert(int data){
		Node newnode=new Node(data);
		if(start==null){
			size++;
			start=newnode;
			return;
		}
		Node current =start;
		while(current.next!=null){
			current=current.next;
		}
		size++;
		current.next=newnode;
	}
	
	public void display(){
		if(start==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		System.out.println("\n=======list=======\n");
		Node current =start;
		while(current.next!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	
	
	public void add(int data,int p){
		Node newnode=new Node(data);
		Node current=start;
		Node prenode=start;
		int d=0;
		if(p>size||p<1){
			if(p==size+1){
				while(current!=null){
					current=current.next;
					d++;
					if(d!=1){
						prenode=prenode.next;
					}
				}
				size++;
				prenode.next=newnode;
				return;
			}
			System.out.println("\n invalid position");
			return;
		}
		for(int i=1;i<=size;i++){
			if(i==p){
				if(current==start){
					newnode.next=start;
					start=newnode;
					size++;
					return;
				}
				
				else{
					newnode.next=prenode.next;
					prenode.next=newnode;
					size++;
					return;
				}
			}
			if(i!=1){	prenode=prenode.next;}
			current=current.next;
		}
		
	}
	
	
	
	public void delete(int p){
		Node current=start;
		Node prenode=start;
		if(p>size||p<1){
			System.out.println("\n invalid position");
			return;
		}
		for(int i=1;i<=size;i++){
			if(i==p){
				if(current==start){
					start=start.next;
					size--;
					return;
				}
				if(current.next==null){
					size--;
					prenode.next=null;
				}
				else{
					size--;
					prenode.next=prenode.next.next;
					return;
				}
			}
			if(i!=1){	prenode=prenode.next;}
			current=current.next;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		si_test s=new si_test();
		
		s.start=null;
		
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.display();
		System.out.println("\n--------add with position---------\n");
		
		s.add(90,6);
		s.display();
		
		s.delete(6);
		s.display();
		
	}
}