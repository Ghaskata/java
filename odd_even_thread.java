//25. Write a program to accept 2 numbers from command line and create 2 threads to display odd and even numbers between these 2 numbers.

//class thread1 extends Thread{
//	
//	public void run(){
//		System.out.println("odd");
//	}
//}

//class thread2 extends Thread{
//	public void run(){
//		System.out.println("even");
//	}
//}

//public class odd_even_thread{
//	public static void main(String[] args) {
//		
//		int n1=Integer.parseInt(args[0]);
//		int n1=Integer.parseInt(args[1]);
//		
//		thread1 t1=new thread1(n1,n2);
//		thread2 t2=new thread2(n1,n2);
//		
//		t1.start();
//		t2.start();
//	}
//}



class oddeven implements Runnable {
	int n1,n2;
	public oddeven(int a,int b){
		this.n1=a;
		this.n2=b;
	}

    public void run() {
            printEven(n1,n2);
            printOdd(n1,n2);
    }

    public void printEven(int a,int b) {
        for (int i = a; i <= b; i += 2) {
            Thread t=Thread.currentThread();
            String tname=t.
            System.out.println(i+""+Thread.currentThread());
             System.out.println(i+""+);          
        }
    }

    public  void printOdd(int a,int b) {
        for (int i = 1; i <= 11; i += 2) {
            System.out.println(i+""+Thread.currentThread());
        }

    }
}

public class odd_even_thread{

    public static void main(String[] args) {
    	
    	int n1=5;
    	int n2=10;

        oddeven obj= new oddeven(n1,n2);
        
        Thread td1 = new Thread(obj,"td1");
        Thread td2 = new Thread(obj,"td2");
        
        td1.start();
        td2.start();

    }
}







//online 

//class Thread1 implements Runnable {

//    private static boolean evenFlag = true;

//    public synchronized void run() {
//        if (evenFlag == true) {
//            printEven();
//        } else {
//           printOdd();
//        }
//    }

//    public void printEven() {
//        for (int i = 0; i <= 10; i += 2) {
//            System.out.println(i+""+Thread.currentThread());
//            
//        }
//        evenFlag = false;
//    }

//    public  void printOdd() {
//        for (int i = 1; i <= 11; i += 2) {
//            System.out.println(i+""+Thread.currentThread());
//        }
//        evenFlag = true;
//    }
//}

//public class OddEvenDemo {

//    public static void main(String[] args) {

//        Thread1 t1 = new Thread1();
//        Thread td1 = new Thread(t1,"td1");
//        Thread td2 = new Thread(t1,"td2");
//        td1.start();
//        td2.start();

//    }
//}




