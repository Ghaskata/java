class Node{
         int data;
         Node next;
         Node(int data){
         	this.data=data;
         	this.next=null;
         }
    }


public class singly{
    
Node start;
    
    void insert(int data){
    	Node current=start;
    	
    	while(current.next!=null){
    		current=current.next;
    		}
    		Node newnode=new Node(data);
    		current.next=newnode;
    	}
    	
    	
    void delete(int data){
    		if(data==start.data){
 		 			start=start.next;
 		 			return;
    		}
    		Node current=start;
    		while(current.next.data!=data){
    			current=current.next;
    			}
    			System.out.println("de===="+data);
    			current.next=current.next.next;
    		
    	}
    	
    	
    void display(){
    	Node current=start;
    	while(current.next!=null){
    		System.out.println(current.data);
    		current=current.next;
    		}
    		System.out.println(current.data);
    	}
    	
    void search(int data){
    	Node current=start;
    	int position=0;
    	while(current!=null){
    		if(current.data==data){
    			  System.out.println("found  "+data+"  at  "+position   +"position");
    			}		
    		current=current.next;
    		position++;
    		}
    	}
	
	
	
	public static void main(String[] args) {
		singly s=new singly();
		s.start=new Node(5);
		
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		System.out.println("\n dispay :");
		s.display();
		System.out.println("\n 30 delete :");
		s.delete(30);
		System.out.println("\n dispay :");
		s.display();
		System.out.println("\n search :");
		s.search(20);
	}
}