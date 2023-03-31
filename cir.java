public class cir{
    
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
    	Node newnode =new Node();
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
 	  
 	 static Node addafterone(Node last,int data,int predata){
 	 	if(last==null)
 	 			return addempty(last,data);
 	 	Node newnode,p;
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
 	 		}while(p.next!=last.next);
 	 		
 	 		System.out.println("item" +predata+ "mot found in list");	
 	 	
 	   return last;
 	 }
      
       static Node delete(Node last,int data){       	
       	if(last==null){
       				System.out.println("list is empty");
       				return last;
       	}
       	if(last.data==data && last.next==last){
       			last=null;
       			return last;
       		}
       	
       	Node temp=last,d=new Node();
       	if(last.data==data){
       			while(temp.next!=last){
       					temp=temp.next;
       				}
       			   temp.next=last.next;
       			   last=temp.next;
       		}
       		
       		while(temp.next!=last&&temp.next.data!=data){
       			temp=temp.next;
       			}
       		if(temp.next.data==data){
       				d=temp.next;
       				temp.next=d.next;
       			}
       	
       	return last;
       }
       
       static void display(Node last){
       	Node p;
       	if(last==null){
       		System.out.println("list is empty");
       		return;
       	}
       	p=last.next;
       	do{
       		System.out.println(p.data);
       		p=p.next;
       	}while(p!=last.next);
       
       }

	
	public static void main(String[] args) {
		Node last=null;
		
		display(last);
		System.out.println("\n==========");
		
		System.out.println("\n10 add to empty\n");
		last=addempty(last,10);
		display(last);
		System.out.println("\n==========");
		
		
		System.out.println("\n20 add to front\n");
		last=addfont(last,20);
		display(last);
		System.out.println("\n==========");
		
		
		System.out.println("\n30 add to end\n");
		last=addend(last,30);
		display(last);
		System.out.println("\n==========");
		
		
		System.out.println("\n40 add after 10\n");
		last=addafterone(last,40,10);
		display(last);
		System.out.println("\n==========");
		
		
		System.out.println("\ndelete 40\n");
		last=delete(last,40);
		display(last);
		System.out.println("\n==========");

	}
}