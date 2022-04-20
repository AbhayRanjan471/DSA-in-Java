package Patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();                   //n=4
	 int i=1;                             //1
	  while(i<=n)                        // 12   
	  {                                 //  123
		 int j=1;                         //1234
		 while(j<=i) {
			 System.out.print(j);
			 j++;
		 }
		 System.out.println();
		 i++;
	  }

	}

}
