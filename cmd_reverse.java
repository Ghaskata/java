

public class cmd_reverse extends Exception{
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++){
			
			System.out.print(" ");
			String s=args[i];
			int len=args[i].length();
			
			for(int j=len-1;j>=0;j--){
				System.out.print(args[i].charAt(j));
				try{Thread.sleep(1000);}
				catch(Exception e){}
			}
			
			
		}
		
		
		
		
	}
}