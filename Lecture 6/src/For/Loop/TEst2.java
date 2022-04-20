package For.Loop;

import java.util.Scanner;

public class TEst2 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			
			int n=s.nextInt();            //n=4
			int i=1;                     // *000*000*
			while(i<=n) {                // 0*00*00*0
				int j=1;                //  00*0*0*00
				                        //  000***000
				while(j<=(2*n)+1) {
					
					if(j==i||j==(n+1)||j==(2*n)-i+2)
							{
						System.out.print("*");
							}
					else {
						System.out.print("0");
					}
					j++;
				}
				System.out.println();
				i++;
			}

	}

}
