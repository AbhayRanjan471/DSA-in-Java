package Patterns;

import java.util.Scanner;

public class FindPowerOfNo {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int x=s.nextInt();
		 int n=s.nextInt();
		 int power=1;                 //4^2=8
		 int i=1;
		 
		 while(i<=n) {
			 power=(power*x);
			 i++;
		 }
		 System.out.println(power);

	}

}
