package For.Loop;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
//		 Explxnation:Now the number is ‘6’ so we have to find the “6th” Fibonacci number
//		 So by using the property of the Fibonacci series i.e 
//
//		 [ 1, 1, 2, 3, 5, 8]
//		 So the “6th” element is “8” hence we get the output
		 
			int n=s.nextInt();
			int sum;
			int a=0;
	        int b=1;
			for(int i=0;i<n;i++){
	            sum=a+b;
	            a=b;
	            b=sum;
	        }
	        System.out.println(a);// 'a' store the previous sum
		 

	}

}
