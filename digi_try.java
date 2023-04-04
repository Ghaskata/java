import java.util.*;  //java.util.Date;

public class digi_try extends Thread{
	public static void main(String[] args) {
	try{	
		int hh,mm,ss;
		while(true){
			Thread t=new Thread("demo");		
		Date d=new Date();
		Calendar cal = Calendar.getInstance();
		hh=d.getHours();
		mm=d.getMinutes();
		ss=d.getSeconds();
		
		System.out.print(d);
//		System.out.print(cal);
					if(hh<12){
						System.out.println("   am");
					}
					else{
						System.out.println("   pm");
					}
					
					t.sleep(1000);
		}
	}
	catch(Exception e){	System.out.println("error");}
	}
}

