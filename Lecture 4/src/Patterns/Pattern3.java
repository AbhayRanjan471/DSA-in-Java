package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);        //  1234
		int n=s.nextInt();                       //  1234
		int i=1;                                 //  1234
		while(i<=n) {                            //  1234
			int j=1;
			while(j<=n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
