package Function;

import java.util.Scanner;

public class nCr_function_to_function_call {
	

	public static int factorial(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	
	public static int nCr(int n,int r) 
	{
		int num=factorial(n);        //here int num,den1,den2; are local variable to nCr ,we cannot access these outside this function
		int den1=factorial(r);
		int den2=factorial(n-r);
		
		int ans=num/(den1*den2);
		 return ans;
	}

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int r=s.nextInt();
     
    int output= nCr(n,r);
    System.out.println(output);

	}

}

      // We can do in this way aslo
//	public static int factorial(int n)
//	{
//		int ans=1;
//		for(int i=1;i<=n;i++)
//		{
//			ans=ans*i;
//		}
//		return ans;
//	}
//	
//	public static void nCr(int n,int r) 
//	{
//		int num=factorial(n);
//		int den1=factorial(r);
//		int den2=factorial(n-r);
//		
//		int ans=num/(den1*den2);
//		System.out.println(ans);
//	}
//
//	public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     int r=s.nextInt();
//     
//     nCr(n,r);
//
//
//	}
//}