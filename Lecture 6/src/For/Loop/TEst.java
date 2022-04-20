package For.Loop;

import java.util.Scanner;

public class TEst {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();            //n=5
		                             // 5432*
		for(int i=1;i<=n;i++)        // 543*1
		{                           //  54*21
			int k=n;                //  5*321
			int p=n-i+1;           //   *4321
			for(int j=1;j<=n;j++)
			{
				if(j==p) {
					System.out.print("*");
					k--;
				}
				else {
					System.out.print(k);
					k--;
				}
				
			}
			System.out.println();
			
		}
		

	}

}
