package Patterns;
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		 
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)                            //Alternate approach
		{                                      // check pattern 13 this one is lenthy
		int j=1;
		while(j<i)
		{
		System.out.print(" ");
		j++;
		}
		System.out.print(i);
		        j=1;
		        while(j<=2*(n-i))
		        {
		        System.out.print(" ");
		        j++;
		        }
		      if(i!=n)
		        System.out.print(i);
		       
		        System.out.println();
		        i++;
		}
		i=n-1;
		while(i>0)
		{
		int j=1;
		while(j<i)
		{
		System.out.print(" ");
		j++;
		}
		System.out.print(i);
		        j=1;
		        while(j<=2*(n-i))
		        {
		        System.out.print(" ");
		        j++;
		        }
		      if(i!=n)
		        System.out.print(i);
		       
		        System.out.println();
		        i--;
		}

		}

		

	}


