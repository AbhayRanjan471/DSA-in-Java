package Assignment;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		
		//Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//		For eg. if number given is 18, answer is 4.
		
		  Scanner s=new Scanner(System.in);
	        int n =s.nextInt();
	        System.out.println((int)(Math.sqrt(n)));

	}

}
