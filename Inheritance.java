import java.util.*;
class get{
   int tid ,salary;
    String name ,type;
    public void getdata(int tid,String name,int salary,String type){
        this.tid = tid;
        this.name = name;
        this.salary = salary;
        this.type=type;
    }
}
class put extends get{
       
public void putdata(){

             System.out.println("   " + tid + "  "+ name + "  "+ salary + "  "+ type + "  ");
        
       }
}
public class Inheritance {
    public static void main(String args[]){
         
         Scanner s = new Scanner(System.in);
         System.out.println("\nEnter total at least 10 records 5 is Teaching staff and 5 is non teaching staff\n ");
         System.out.print("enter total number ");
         int n = s.nextInt();
         put p[] = new put[n];
         
          int tid ,salary;
    String tname ,type;
         for(int i=0;i<n;i++){
            System.out.print("\nenter teacher id : ");
            tid = s.nextInt();
            System.out.print("enter teacher name : ");
            tname= s.next();
            System.out.print("enter teacher salary : ");
            salary = s.nextInt();
            System.out.print("enter type  : ");
            type = s.next();
            p[i]=new put();
            p[i].getdata(tid,tname,salary,type);
         }
         
         for(int i=0;i<n;i++){
         p[i].putdata();
         }
    }
}