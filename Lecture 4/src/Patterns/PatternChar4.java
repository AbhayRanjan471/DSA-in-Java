package Patterns;

import java.util.Scanner;

public class PatternChar4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);           //  A 
		int n=s.nextInt();                          //  BC 
		int i=1;                                    //  CDE
		                                            //  DEFG
		while(i<=n) { 
			int j=1;
			int k=i;                               //k= starting char
			while(j<=i)
			{
				System.out.print((char)('A'+k-1));
				j++;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
