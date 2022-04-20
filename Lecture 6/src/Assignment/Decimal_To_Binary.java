package Assignment;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//ex u took "22" as input number
		long rev =0;//this will store ur overall binary representation
        int place_counter=0;//this keep count of place value..like one's,ten's,hundred's,thousand's
		while(n>0)//n should be greater than 0 not 0 
		{
			long d=n % 2;//calculate binary of either 1 or 0
			n=n/2;//dividing number
			rev=rev+(long)(d*Math.pow(10,place_counter));//first "0" bit will get assigned to one's place...then again coming in loop
                                                         // next "1" will get placed at ten's position n so on
            place_counter++;
			
		}
		 System.out.print(rev);//binary form of 22 i.e    "10110"
		 

	}

}
