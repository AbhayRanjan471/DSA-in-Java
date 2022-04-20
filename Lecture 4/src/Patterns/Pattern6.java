package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);        //  1
		int n=s.nextInt();                       //  23
		int i=1;                                 //  345
		                                         //  4567
		
		while(i<=n) { 
			int j=1;
			int k=i;
			while(j<=i) {
				System.out.print(k);
				j++;
				k++;                           //k=starting integer
			}
			System.out.println();
			i++;
		}

	}

}
