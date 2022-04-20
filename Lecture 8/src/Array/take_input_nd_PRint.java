package Array;


import java.util.Scanner;

public class take_input_nd_PRint {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int size =s.nextInt();
		 
		 int input[]=new int[size];  // making an array
		 
	 for(int i=0; i<size;i++) //  this loop is use to take input from  user
	 {
		 input[i]=s.nextInt();// taking input
	 }
	 for(int i=0;i<size;i++) //this loop is use to print the data input by user
	 {
		 System.out.print(input[i]+" ");
	 }

	}

}
