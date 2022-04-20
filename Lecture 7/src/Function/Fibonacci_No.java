package Function;

import java.util.Scanner;

public class Fibonacci_No {
	
//	Given a number N, figure out if it is a member of fibonacci series or not. 
//	Return true if the number is member of fibonacci series else false
	
	public static boolean checkMember(int n) {
		
		if (n==0) {           // series:- 0 1 1 2 3 5 8 13 21 34 55 89 ......
			return true;
		}                          //eg. n=8 loop 8 time run ho ge agr us us loop k andar 8 mil gaya then it will return true o
		                            //   in this we will get 8 at 6th position 
		int i=1; int sum=0;
		int a=0,b=1;
		while(i<=n) {
			
			sum=a+b;
			a=b;
			b=sum;
			
			if( sum==n) {
				return true;
			}
			
			i++;
		}
		
		
		return false;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		boolean isfibonacci  = checkMember(n);
System.out.println(isfibonacci);

	}

}
