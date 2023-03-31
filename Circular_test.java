public class Circular_test{
	static class Node{
		int data;
		Node next;
	}
	static Node addtoempty(Node last,int data){
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
				return addtoempty(last,data);
				
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		
		
		return last;
	}
	
	
	static Node addend(Node last,int data){
		if(last==null)
				return addtoempty(last,data);
		
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		last=newnode;
		return last;
	}
	
	
	static Node addafterone(Node last,int data,int predata){
		if(last==null)
				return last;
		Node p,newnode;
		p=last.next;
		do{ 
			if(p.data==predata){
				newnode=new Node();
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
			System.out.println("list is empty");
			return last;
		}
		
		if(last.data==data && last.next==last){
			System.out.println("list has only one node that node data match your delete data so now list is empty");
			last=null;
			return last;
		}
		
		Node temp=last,d=new Node();
		if(last.data==data){
				while(temp.next!=last){
					temp=temp.next;
				}
				temp.next=last.next;
				last=temp;
		}
		
		while(temp.next!=last && temp.next.data!=data){
			temp=temp.next;
		}
			
		if(temp.next.data==data){
		//d=temp.next;
		//temp.next=d.next;	
			
			
		temp.next=temp.next.next;
		}
	
	
		return last;
	}
	
	
	
	static void display(Node last){
		if(last==null){
			System.out.println("\nlist is empty\n");
			return;
		}
		Node p=last.next;
		do{
			System.out.println(p.data);
			p=p.next;			
			}while(p!=last.next);
	}
	
	
	
	public static void main(String[] args) {
		Circular_test c=new Circular_test();
		
		Node last=null;
		
		System.out.println("\n---> node 5 add to empty \n");
		last=addtoempty(last,5);
		display(last);
		System.out.println("\n••••••••••••••••••\n");
		
		
		System.out.println("\n---> 10,20 add to font \n");
		last=addfont(last,10);
		last=addfont(last,20);
		display(last);
		System.out.println("\n••••••••••••••••••\n");
		
		
		System.out.println("\n---> 30,40 add to end\n");
		last=addend(last,30);
		last=addend(last,40);
		display(last);
		System.out.println("\n••••••••••••••••••\n");
		
		
		System.out.println("\n---> 50 add to after 5 \n");
		last=addafterone(last,50,5);
		display(last);
		System.out.println("\n••••••••••••••••••\n");
		
		
		System.out.println("\n---> 30 delete \n");
		last=delete(last,30);
		display(last);
		System.out.println("\n••••••••••••••••••\n");
		
	}
}