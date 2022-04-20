package If_else;
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
	
	if(c>='A'&&c<='Z') {
		System.out.println("1");
	}
	else if(c>='a'&&c<='z') {
		System.out.println("0");
	}
	else {
		System.out.println("-1");
	}
	
	
 
	
	
//char a=s.next().charAt(0);
//	
//	if(a>=65&&a<=90) {
//		System.out.println("1");
//	}
//	else if(a>=97&&a<=122) {
//		System.out.println("0");
//	}
//	else {
//		System.out.println("-1");
//	}
	
	
//	char a=s.next().charAt(0);
//	int c=a;
//	if(c>=65&&c<=90) {
//		System.out.println("1");
//	}
//	else if(c>=97&&c<=122) {
//		System.out.println("0");
//	}
//	else {
//		System.out.println("-1");
//	}
	}
}

