//Write a program to accept multiple line contents until you press “N” Then check total no 
//of consonants, lines & total no. of word.
//Input:
//Enter Strings:
//This is java book
//Continue: Y
//Java is programming Lang.
//Continue: N
//Output: 
//Total line: 2
//Consonants: 22
//Words: 08
import java.util.*;

class content{
	Scanner sc=new Scanner(System.in);	
	int line=0,words=0,constants=0;	
	
	public void enter_line(){
			System.out.print("enter strings : ");
			String s=sc.nextLine();
			this.line++;
			String str[]=s.split(" ");
			for(int i=0;i<str.length;i++){
				this.words++;
				for(int j=0;j<str[i].length();j++){
					char c=str[i].charAt(j);
					
					if(c>='a'&&c<='z'||
					c>='a'&&c<='z'){
							if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
    c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
						
						}
						else{
							this.constants++;
						}//second if end
					}//frist if end
				}// j for end
			}// i for end
		}// enter_line end
		
		
		public void display(){
			System.out.println("\n---------------\n");
				System.out.println("Total Lines : "+line);
				System.out.println("Constants : "+constants);
				System.out.println("words : "+words);
		}
}


public class multiline_content{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
				
		content obj=new content();
		
		obj.enter_line();
		
		while(true){			
			System.out.print("Continue : ");
			String choice=sc.next();
			
			if(choice.charAt(0)=='Y'){
				obj.enter_line();
			}
			else if(choice.charAt(0)=='N'){				
				obj.display();
				return;			
			}	
			else{
				System.out.println("please enter 'Y' or 'N' ");
				continue;
			}		
		}	//while end
				
	}
}


