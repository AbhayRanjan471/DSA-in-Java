package Patterns;

import java.util.Scanner;

public class PatternChar1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);           //  ABCD
		int n=s.nextInt();                          //  ABCD
		int i=1;                                    //  ABCD
		                                            //  ABCD
		while(i<=n) { 
			int j=1;
			while(j<=n)
			{
				System.out.print((char)('A'+j-1));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
