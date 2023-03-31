public class C{
	static class Node{
		int data;
		Node next;
	}
	static Node addtoempty(Node last,int data){
		if(last!=null)
				return last;
				
		Node newnode =new Node();
		newnode.data=data;
		last=newnode;
		newnode.next=last;
		System.out.println("\n inserted \n");
		return last;
	}
	
	
	static Node addfont(Node last,int data){
		if(last==null)
			return addtoempty(last,data);
		System.out.println("\nadd at front :\n");
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		
		return last;
	}
	
	
	static Node addend(Node last,int data){
		if(last==null)
				return addtoempty(last,data);
				
		System.out.println("\n add at end  :\n");
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		last=newnode;
	
		return last;
	}
	
	
	static Node addafterone(Node last,int data,int predata){
		if(last==null)
				return addtoempty(last,data);
		System.out.println("\n add middle  :\n");
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
			}
			p=p.next;
		}while(p!=last.next);	
		
		return last;
	}
	
	
	static Node delete(Node last,int data){
		if(last==null){
			System.out.println("\n list is empty\n");
			return last;
		}
		System.out.println("\n delete  : \n");
		
		if(last.data==data&&last.next==last){
			System.out.println("\n one element that was deleted \n");
			last=null;
			return last;
		}
		
		Node temp=last;
		
		if(last.data==data){
			while(temp.next!=last){
				temp=temp.next;
			}
			temp.next=last.next;
			last=temp;
			return last;
		}
		
		while(temp.next!=last&&temp.next.data!=data){
			temp=temp.next;
		}
		if(temp.next.data==data){
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
	C c=new C();
	Node last=null;
	
	last=addtoempty(last,5);
    display(last);
    
    System.out.println("-----------");
    
    last=addfont(last,10);
    display(last);
    
    System.out.println("-----------");
    
    last=addend(last,20);
    display(last);
    
   System.out.println("-----------");
    
    last=addafterone(last,30,5);
    display(last);
    
     System.out.println("-----------");
    
    last=delete(last,30);
    display(last);
	}
}