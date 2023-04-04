//baki

//Write a program to implement stack using thread

import java.util.Stack;

class stack implements Runnable{
		// create an object of Stack class
    Stack<Integer> animals= new Stack<>();
    
   public void run(){
    // push elements to top of stack
    animals.push(1);
    animals.push(2);
    animals.push(3);
    
    System.out.println("Stack: " + animals);
 
    animals.pop();    

    System.out.println("Stack: " + animals);
   }
    
}


class stack_opration{
  public static void main(String[] args) {		
    	stack sc=new stack();	
    	stack s=new stack();
		Thread t1=new Thread(sc,"t2");
		Thread t2=new Thread(s,"t2");
		
		t1.start();
		t2.start();
    }
}