//jump item

import java.util.*;
class item extends Thread{
	Scanner sc=new Scanner(System.in);
	int icode,price,stock;
	String name;
	item(){
		System.out.print("\n\nenter code : ");
		this.icode=sc.nextInt();
		System.out.print("enter name : ");
		this.name=sc.next();
		System.out.print("enter price : ");
		this.price=sc.nextInt();
		System.out.print("enter stock : ");
		this.stock=sc.nextInt();
		
	}
	
	static void sortdata(item s[],int n){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int n1=s[i].stock;
				int n2=s[j].stock;
				if(n1>n2){
					item t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		System.out.println("\ncode : "+s[i].icode);
		System.out.println("name : "+s[i].name);
		System.out.println("price : "+s[i].price);
		System.out.println("stock : "+s[i].stock);
		System.out.println("");
		try{			Thread.sleep(1000);		}
		catch(Exception e){System.out.print(e);}
		}
	}
	
	
}


public class jump_item{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nenter no of item : ");
		int n=sc.nextInt();
		
		item s[]=new item[n];
		for(int i=0;i<n;i++){
			s[i]=new item();
		}
		
		System.out.println("\n\n-------sort item by stock in acending----------");
		item.sortdata(s,n);
	}
}