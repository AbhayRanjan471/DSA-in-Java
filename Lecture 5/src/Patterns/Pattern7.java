package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //   1    N=4
		int n=s.nextInt();                   //   232   
		int i=1;                             //  34543
		                                     // 4567654
		while(i<=n) {
			int space=1;
			int j=1;
			 
			while(space<=n-i)
			{
				System.out.print(" ");    //did it by myself in one attempt
				space++;
			}
			int x=i;
			while(j<=i) {
				System.out.print(x);
				j++;
				x++;
				 
			}
			int k=1;
			int p=x-2;          //here we are storing the last digit of x or -2 isliye kr rahe hai kyu ki 25line me x ka ak value already increase 
			              //increas ho gaya hai or -1 fir isliye kr rahe hai kyu ki hume jo next digit chahiye wo previous wale digit se ak kam hai
 			
			while(k<i)
 			{
  				System.out.print(p);
 				p--;
 				k++;
 			}
			System.out.println();
			i++;
		}

	}

}
