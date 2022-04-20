package Assignment;
//Given k, find the geometric sum i.e.
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)

//Sample Input 1 :
//3
//Sample Output 1 :
//1.87500

import java.util.Scanner;

public class Geometric_Sum {
	
	public static double findGeometricSum(int k){
		// Write your code here

        if(k == 0){
            return 1;
        }
        double seriesSum = findGeometricSum(k - 1);
        double sum=seriesSum + Math.pow(1/2.0 ,k); // here we have converted 1/2 in double by taking 1/2.0
        return sum;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int n=s.nextInt();  // input =15
		 System.out.println(findGeometricSum(n));

	}

}
