//Design a class Cricketer having data member name and number of matches and appropriate member function to set the values. Derive two classes Batsman and Bowler from Cricketer class with data member total number of runs and wickets respectively. Batsman class is having a method to calculate average run rate and Bowler class is having method to calculate average wicket. Write a program to create two objects and displays information of one batsman and bowler along with average run and wicket.

import java.util.*;

class Cricketer{
	Scanner sc=new Scanner(System.in);
	int no;
	String name;	
	public void setdata(){
		System.out.print("\nenter cricketer no : ");
		this.no=sc.nextInt();
		System.out.print("enter cricketer name : ");
		this.name=sc.next();
		System.out.println("");
	}
	
}


class batsman extends Cricketer{
	int total_run;
	int total_over;
	public batsman(){
		super.setdata();
		System.out.print("\nenter total run : ");
		this.total_run=sc.nextInt();
		System.out.print("enter over used by batsman : ");
		this.total_over=sc.nextInt();
		System.out.println("");
	}	
			
	public void avrage_runrate(){
		System.out.print("\navrage run rate of batsman "+this.name+" is : "+(total_run/total_over*6));
	}
}

class bowler extends Cricketer{
	int total_wicket;
	int total_run;
	
	public bowler(){
		super.setdata();
		System.out.print("\nenter total run given by bowler : ");
		this.total_run=sc.nextInt();
		System.out.print("enter total wicket taken by bowler : ");
		this.total_wicket=sc.nextInt();
		System.out.println("");
	}	
	
	public void avrage_wicket(){
		System.out.println("\navrage wicket of bowler "+this.name+" is : "+(total_run/total_wicket));
	}
}



public class CricketEx{
	public static void main(String[] args) {
		
		System.out.println("\n-------enter batsman detail------\n");
		batsman bm=new batsman();
		
		bm.avrage_runrate();
		System.out.println("\n-------------\n");
		
		System.out.println("\n-------enter bowler detail------\n");
		bowler b=new bowler();		
		b.avrage_wicket();
	}
}