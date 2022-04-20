package For.Loop;

import java.util.Scanner;

public class TEst3 {
   //check Armstrong
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			
			int n=s.nextInt();
			int c=0;
			int d=n;
			int p=n;
			while(p>=1) {
				int rem=p%10;
				p=p/10;
				c++;
				
			}
			int arm=0;
			while(n>=1)
			{
				int rem=n%10;
				n=n/10;
				
				 arm=(int)(arm+(Math.pow(rem,c)));
			}
			 if(arm==d) {
				 System.out.println("true");
			 }
			 else {
				 System.out.println("false");
			 }
				 

	}

}
