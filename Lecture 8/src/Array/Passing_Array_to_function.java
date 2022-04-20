package Array;
import java.util.Scanner;
public class Passing_Array_to_function {
	
	//Alternate method
	// This we will learn how to pass Scanner
	public static void print(int input[])
	{
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		
	
}
	public static  int[] Takinginput(int n,Scanner s) {  // this is the way to take Scanner ie(Scanner variable name)
		           int size=n;
		
				int input[]=new int[size];
				for(int i=0;i<size;i++)
				{
					input[i]=s.nextInt(); // for this statement we are passing Scanner on line 29
				}
		return input;
	}

	public static void main(String[] args) {

     Scanner s=new Scanner(System.in);
     int size=s.nextInt();
    // int input[]=new int[size]; // here we have made an array of name input
     
    int arr[]= Takinginput(size,s); //here we r sending the value of 'size' and scanner ie. 's'
    print(arr);
      
	}

}
