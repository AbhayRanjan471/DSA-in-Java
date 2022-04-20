package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);        //  4321
		int n=s.nextInt();                       //  4321
		int i=1;                                 //  4321
		while(i<=n) {                            //  4321
			int j=1;
			while(j<=n) {
				System.out.print(n-j+1);
				j++;
				 
			}
			System.out.println();
			i++;
		}

	}

}
