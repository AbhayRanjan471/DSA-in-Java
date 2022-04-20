package For.Loop;

import java.util.Scanner;

public class SumTillN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
		int n=s.nextInt(); 
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
 System.out.println(sum);
	}

}
// we can do inisilization in this way also
// for(int i=1 ; i<=n&&sum<100 ; i++)
//for(int i=1,j=1 ; i<=n&&sum<100 ; i++ ,j++)