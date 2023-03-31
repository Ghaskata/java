public class digi extends Thread{
	

	
	public static void main(String[] args) {
		int hh,mm,ss;
		try{
			Thread t=new Thread("demo");
			for(hh=0;hh<24;hh++){
			for(mm=0;mm<60;mm++){
				for(ss=0;ss<60;ss++){
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
		}
		}
		catch(Exception e){System.out.println(e);}
	}
}