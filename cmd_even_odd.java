//Write a program to accept numbers from command line and display sum of odd and even numbers

public class cmd_even_odd{
	public static void main(String[] args) {
		int sum_odd=0;
		int sum_even=0;
		int l=args.length;
		try{
			for(int i=0;i<l;i++){
				int a=Integer.parseInt(args[i]);
				if(a%2==0){
					sum_even+=a;
				}
				if(a%2!=0){
					sum_odd+=a;
				}
			}
			
			System.out.println("\nsum of even numbers : "+sum_even);
			System.out.println("\nsum of odd numbers : "+sum_odd);
		}
		catch(Exception e){
			System.out.println("please enter no in cmd");
			System.out.println(e);
		}
	}
}