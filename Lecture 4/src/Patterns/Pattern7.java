package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);        //  1
		int n=s.nextInt();                       //  23
		int i=1;                                 //  456
		                                         //  78910
		int k=1;
		while(i<=n) { 
			int j=1;
			 
			while(j<=i) {
				System.out.print(k);
				j++;
				k++;
			}
			System.out.println();
			i++;
		}


	}

}
