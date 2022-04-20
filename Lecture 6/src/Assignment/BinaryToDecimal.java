package Assignment;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		
//		Given a binary number as an integer N, convert it into decimal and print
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int i=0;
		 int sum=0;
		 while(n>=1)
		 {
			 int r=n%10;
			 n=n/10;
			 
			  sum=(int)(sum + r*(Math.pow(2,i)));
			  i++;
		 }
		 System.out.println(sum);
		 
	}

}
