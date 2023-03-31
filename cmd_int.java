
public class cmd_int extends Thread{
	public static void main(String[] args) {
		try{
			int n=Integer.parseInt(args[0]);
			System.out.println("orignal no is :"+n);
			int r=0,mod,no=n;
			while(no!=0){
				mod=no%10;
				r=(r*10)+mod;
				no=no/10;
			}
			System.out.println("reverse is :"+r);
			if(n==r){
			System.out.println("number is palidrom");
		}
		else{
			System.out.println("number is not palidrom");
		}
		}
		catch(Exception e){
			System.out.println("please enter digit");
		}
		
	}
}






//public class cmd_int extends Thread{
//	public static void main(String[] args) {
//		try{
//		for(int i=0;i<args.length;i++){
//			int a=Integer.parseInt(args[i]);
//			System.out.println(a);
//			Thread.sleep(1000);
//		}		
//		}
//		catch(Exception e){
//			System.out.println("please enter digit");
//		}
//		
//	}
//}