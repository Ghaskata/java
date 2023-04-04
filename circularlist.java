import java.util.*;

public class circularlist{
	
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
	System.out.println(data+" is inserted");
		return last;
	}
	
	static Node addfont(Node last,int data){
		if(last==null)
			return addempty(last,data);
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
	System.out.println(data+" is inserted from front");
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
	System.out.println(data+" is inserted from end");
		return last;
	}
	
	static void display(Node last){
			if(last==null){
				System.out.println("\nempty list \n");
				return;
			}
			Node p=last.next;
			do{ 
				System.out.println(p.data);
				p=p.next;
			}while(p!=last.next);
	}
	
	
	static Node delete(Node last,int data){
		if(last==null){
				System.out.println("\nempty list \n");
				return last;
		}
		if(data==last.data&&last.next==last){
			last=null;
			System.out.println(data+" is deleted");
			return last;
		}
		Node p=last;
		if(last.data==data){
			while(p.next!=last){
				p=p.next;
			}
			p.next=last.next;
			last=p;
			System.out.println(data+" is deleted");
			return last;
		}
		while(p.next.data!=data&&p.next!=last){
			p=p.next;
		}
		if(p.next.data==data){
			p.next=p.next.next;
			System.out.println(data+" is deleted");
			return last;
		}
		System.out.println(data+" is not found");
		return last;
	}
	
	
		static Node addmid(Node last,int data,int predata){
		if(last==null){
			System.out.println("list is empty");
			return last;
		}
		Node p=last.next;
		do{ 
			if(p.data==predata){
				Node newnode=new Node();
				newnode.data=data;
				newnode.next=p.next;
				p.next=newnode;
				
				if(predata==last.data){
					last=newnode;
				}
				System.out.println(data+" is inserted after "+predata);
				return last;
			}			
			p=p.next;
		}while(p!=last.next);
	System.out.println(predata+" is not found");
		return last;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Node last=null;
	
		
		int c,data;
		while(true){
			System.out.print("\n1.insert from front\n2.insert from end\n3.insert after one\n4.delete\n5.display\n6.exit\n\nenter your choice : ");
			c=sc.nextInt();
			if(c==1){
			System.out.print("enter data : ");
				data=sc.nextInt();
				last=addfont(last,data);
			}
			else if(c==2){
			System.out.print("enter data : ");
				data=sc.nextInt();
				last=addend(last,data);
			}
			else if(c==3){
				int predata;
				System.out.print("enter item after  that you want to insert new data : ");
				predata=sc.nextInt();
			System.out.print("enter data that you want to insert : ");
				data=sc.nextInt();
				last=addmid(last,data,predata);
			}
			else if(c==4){
			System.out.print("enter data that you want to delete : ");
				data=sc.nextInt();
				last=delete(last,data);
			}
			else if(c==5){
				System.out.println("\n---------list is----------");
				display(last);
			}
			else if(c==6){
				return;
			}
			else{
				System.out.println("\ninvalid enter");
			}
			System.out.println("\n===============");
		}//while end
		
	}
}