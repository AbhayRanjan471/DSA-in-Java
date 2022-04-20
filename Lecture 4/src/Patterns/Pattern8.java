package Patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);           //  1
			int n=s.nextInt();                       //  22
			int i=1;                                 //  333
			                                         //  4444
			
			while(i<=n) { 
				int j=1;
				while(j<=i) {
					System.out.print(i);
					j++;
				}
				System.out.println();
				i++;
			}

	}

}
