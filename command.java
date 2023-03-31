public class command extends Thread{
	
	public void add(String s)
{
		System.out.println("concat : "+s);
}

	public void add(int sum){
		System.out.println("sum : "+sum);
	}

	
	public static void main(String[] args){
		command c=new command();
	
			
	     try{
	     int sum=0; 
		for(int i=0;i<args.length;i++){
			sum+=Integer.parseInt(args[i]);
		}
		c.add(sum);
	     }
	     catch(Exception e){
	     		String s="";
		for(int i=0;i<args.length;i++){
			s=s+args[i];
		}
			c.add(s);	     	
		}
	 	     	
	}
}

//    only two argument

//public class command extends Thread{
//	
//	public void add(String a,String b)
//{
//		System.out.println("concat : "+(a+b));
//}

//	public void add(int a,int b){
//		System.out.println("sum : "+(a+b));
//	}

//	
//	public static void main(String[] args){
//		command c=new command();
//	
//			
//	     try{
//			int a=Integer.parseInt(args[0]);
//			int b=Integer.parseInt(args[1]);
//		c.add(a,b);
//	     }
//	     catch(Exception e){
//			c.add(args[0],args[1]);	     	
//		}
//	   	     	
//	}
//}











//	String s="";
//        int sum=0; 
//		for(int i=0;i<args.length;i++){
//			s=s+args[i];
//			try{
//			sum+=Integer.parseInt(args[i]);
//			}
//			catch(Exception e){
//				//System.out.println(e);
//				}
//		}
//		if(sum==0){
//		System.out.println("concat : "+s);
//		}
//		else
//		{
//		System.out.println("sum : "+sum);
//		}