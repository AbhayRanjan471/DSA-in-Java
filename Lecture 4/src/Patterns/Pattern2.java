package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);        //  1111
		int n=s.nextInt();                       //  2222
		int i=1;                                 //  3333
		while(i<=n) {                            //  4444
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
