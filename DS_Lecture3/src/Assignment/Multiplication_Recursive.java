package Assignment;
import java.util.Scanner;
//Given two integers M & N, calculate and return their multiplication using recursion. You
//can only use subtraction and addition for your calculation. No other operators are allowed.
// here I m using the property 2*4 =2+2+2+2

public class Multiplication_Recursive {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	
        if(n ==1){
            return m;
        }
        
        int sum =multiplyTwoIntegers(m , n -1) + m;
        return sum;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int m =s.nextInt();
		int n=s.nextInt();
		 
		 
		System.out.println(multiplyTwoIntegers(m ,n));

	}

}
