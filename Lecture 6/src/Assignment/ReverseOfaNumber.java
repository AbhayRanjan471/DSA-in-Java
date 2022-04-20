package Assignment;
import java.util.Scanner;
public class ReverseOfaNumber {

	public static void main(String[] args) {
		
//		Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev =0;
		while(n>0)
		{
			int d=n % 10;
			n=n/10;
			rev=(rev*10) +d;
		}
		System.out.println(rev);

	}

}
