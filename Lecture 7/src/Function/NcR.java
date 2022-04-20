package Function;

import java.util.Scanner;

public class NcR {
	public static int factorial(int n) 
	{
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;   //its going to return "ans" whose data type is int
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		
		int num=factorial(n);
		
		int den1=factorial(r);
		
		int den2=factorial(n-r);
		
		int ans=num/(den1 * den2);
		System.out.println(ans);
		
		
		

	}

}
