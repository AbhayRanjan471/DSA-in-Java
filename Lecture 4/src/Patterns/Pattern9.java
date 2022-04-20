package Patterns;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);           //  1
			int n=s.nextInt();                       //  21
			int i=1;                                 //  321
			                                         //  4321
			
			while(i<=n) { 
				int j=1;
				int k=i;
				while(j<=i) {
					System.out.print(k);
					j++;
					k--;
				}
				System.out.println();
				i++;
			}

	}

}
