


public class circular {
	
     static class Node{
     	int data;
     	Node next;
     }
	
	//add to empty
	public void addempty(Node last,int data){
		if(last!=null)
				return last;
		//create new node
		Node newnode=new Node();
		newnode.data=data;
		//assign last to new node
		last=newnode;
		//link itself
		newnode.next=newnode;
	}
	
	//add front
	public void addfront(Node last,int data){
		if(last==null)
			return addempty(last,data);
			
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		return last;
	}	
	
	//add end
	public void addend(Node last,int data){
		if(last==null)
			return addempty(last,data);
			
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=last.next;
		last.next=newnode;
		last=newnode;
		return last;
	}
	
	
	//add middle
	public boid addmiddle(Node last,int data){
		if(last==null)
				return last;
		Node newnode,p;
		p=last.next;
		do{
			//if item found place new node after it			
			if(p.data==item){
				Node newnode=new Node();
				newnode.data=data;
				newnode.next=p.next;
				p.next=newnode;
				
				if(p==last)
						last=newnode;
			    return last;
			}
			p=p.next
		}while(p!=last.next)
		
		System.out.println(item+" node in list ");
		return last;
	}
	
	
	//delete node
	
	public static void main(String[] args) {
		
	}
}