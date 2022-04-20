package If_else;
import java.util.Scanner;
public class OddEvenReturn {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=n%2;
		if(rem==0) {
			System.out.println("even");
		    return;     // it will terminate the main program nd will not go to he next line 13
		}
		System.out.println("odd");
		
	}



}
