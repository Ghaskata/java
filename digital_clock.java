import java.util.*;  //java.util.Date;

public class digital_clock extends Thread{
	public static void main(String[] args) {
	try{	
		int hh,mm,ss;
		while(true){
			Thread t=new Thread("demo");		
		Date d=new Date();
		hh=d.getHours();
		mm=d.getMinutes();
		ss=d.getSeconds();
			if(hh>12){
						hh=hh-12;
			}
		System.out.print(hh+" : "+mm+" : "+ss);
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

