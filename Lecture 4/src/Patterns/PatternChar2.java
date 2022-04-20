package Patterns;

import java.util.Scanner;

public class PatternChar2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);           //  ABCD
		int n=s.nextInt();                          //  BCDE
		int i=1;                                    //  CDEF
		                                            //  DEFG
		while(i<=n) { 
			int j=1;
			int k=i;                               //k= starting char
			while(j<=n)
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
         //OR
//    while(i<=n) { 
//	int j=1;
//	char startingchar=(char)('A'+i-1);                               //k= starting char
//	while(j<=n)
//	{
//		System.out.print(startingchar);
//		
//		startingchar=(char)(startingchar+1);
//		j++;
//	}
//	System.out.println();
//	i++;
//}

