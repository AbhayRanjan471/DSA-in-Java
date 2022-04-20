package Patterns;

import java.util.Scanner;

public class IntrestingPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);           //  E 
		int n=s.nextInt();                          //  DE 
	//	int i=1;                                    //  CDE
//		char c=s.next().charAt(0);                  //  BCDE
		                                            //  ABCDE
//		while(i<=n) { 
//			int j=1;
//			int k=i;                              //k= starting char
//			int p=65+n;  //65='A' // n add isliye kiye hai taki pata chal sake ki kaha se character print krna hai
//			while(j<=i)
//			{
//				System.out.print((char)(p-k));     //got the logic while taking shower
//				j++;
//				k--;
//			}
//			System.out.println();
//			i++;
//		}
		 
		// Alternate method check this first
		int i=1;
		while(i<=n) {
			char k=(char)(65+n-i);
			int j=1;
			while(j<=i) {
				System.out.print(k);
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
