class bca extends Thread{
	public void run(){
		while(true){
		System.out.println("BCA");
		try{	Thread.sleep(1000);	}
		catch(Exception e){}
		}
	}
}

class mca extends Thread{
	public void run(){
		while(true){
		System.out.println("     MCA");
		try{	Thread.sleep(3000);	}
		catch(Exception e){}
		}
	}
}


public class ex{
	public static void main(String[] args) {
		bca b=new bca();
		mca m=new mca();
				
		b.start();
		m.start();
	}
}