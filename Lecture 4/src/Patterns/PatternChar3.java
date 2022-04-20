package Patterns;

import java.util.Scanner;

public class PatternChar3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);           //  A 
		int n=s.nextInt();                          //  BB
		int i=1;                                    //  CCC
		                                            //  DDDD
		while(i<=n) { 
			int j=1;
//			int k=i;                               //k= starting char
			while(j<=i)
			{
				System.out.print((char)('A'+i-1));
//				System.out.print((char)('A'+k-1));
				j++;
				
			}
			System.out.println();
			i++;
		}

	}

}
