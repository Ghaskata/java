//Count total no. of vowel, words, char & special characters
import java.util.*;

public class count_special_char{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string : ");
		String s=sc.nextLine();
		
		int v=0,w=0,c=0,sp=0;
		for(int i=0;i<s.length();i++){
			char a=s.charAt(i);
			if(a>='a'&&a<='z' ||a>='A'&&a<='Z' ){
				c++;
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'
		||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
					v++;
				}//if end
			}
			
			else if((a<'0'||a>'9')&&a!=' '){
				sp++;
			}
		}
		
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++){
			w++;
		}				
		
		System.out.println("vowel : "+v);
		System.out.println("char : "+c);
		System.out.println("special char : "+sp);
		System.out.println("word : "+w);
	}
}