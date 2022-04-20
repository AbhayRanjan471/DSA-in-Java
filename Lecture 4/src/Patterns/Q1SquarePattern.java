package Patterns;

import java.util.Scanner;

public class Q1SquarePattern {

	public static void main(String[] args) {      //n=4
		Scanner s=new Scanner(System.in);        //  4444
		int n=s.nextInt();                       //  4444
		int i=1;                                 //  4444
		while(i<=n) {                            //  4444
			int j=1;
			while(j<=n) {
				System.out.print(n);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
