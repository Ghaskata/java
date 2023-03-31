class test_c{
	
	static class Node{
		int data;
		Node next;
	}
	
	static Node addempty(Node last,int data){
		if(last!=null)
				return last;
				
		Node newnode=new Node();
		newnode.data=data;
		last=newnode;
		newnode.next=last;
		
		return last;
	}
	
	static Node addfont(Node last,int data){
		if(last==null)
		 		return addempty(last,data);
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		return last;
	}
	

	static Node addend(Node last,int data){
		if(last==null)
				return addempty(last,data);
		
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		last=newnode;
		
		return last;
	}
	
	static Node addafter(Node last,int data,int predata){
		if (last==null)
					return addempty(last,data);
		
		Node p=last.next;
		do{ 
				if(p.data==predata){
					Node newnode=new Node();
					newnode.data=data;
					newnode.next=p.next;
					p.next=newnode;
					
					if(p==last){
						last=newnode;
					}
					return last;
				}
				p=p.next;
		}while(p!=last.next);
		
		
		return last;
	}
	
	
	static Node delete(Node last,int data){
		if(last==null){
			System.out.println("empty list");
			return last;
		}
		if((last.data==data)&&(last.next==last)){
			last=null;
			return last;
		}
		
		Node p=last.next;
		if(last.data==data){
				while(p.next!=last){
					p=p.next;
				}
				p.next=last.next;
				last=p;
				return last;
		}
		
		while((p.next.data!=data)&&(p.next!=last)){
			p=p.next;
		}
		if(p.next.data==data){
			p.next=p.next.next;
		}
		
		return last;
	}
	
	
	
	
	
	
	static void display(Node last){
		if(last==null){
			System.out.println("empty");
			return;
		}
		Node p=last.next;
		do{ 
			System.out.println(p.data);
			p=p.next;
		}while(p!=last.next);
	}
	
	public static void main(String args[]){
		test_c c=new test_c();
		Node last=null;
		
		System.out.println("\n   add to empty  \n");
		last=addempty(last,5);
		display(last);
		System.out.println("\n++++++++\n");
		
		
		System.out.println("\n 10 , 20  add to font  \n");
		last=addfont(last,10);
		last=addfont(last,20);
		display(last);
		System.out.println("\n++++++++\n");
		
		System.out.println("\n 30 , 40  add to font  \n");
		last=addend(last,30);
		last=addend(last,40);
		display(last);
		System.out.println("\n++++++++\n");
		
		
		System.out.println("\n 90  add after 5 \n");
		last=addafter(last,90,5);
		display(last);
		System.out.println("\n++++++++\n");
		
		
		System.out.println("\n delete\n");
		last=delete(last,90);
		display(last);
		System.out.println("\n++++++++\n");
	
		
	}
	
}