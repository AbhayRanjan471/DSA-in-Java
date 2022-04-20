package Recursion_1;

public class Number_Of_Digits {

//	Given the code to find out and return the number of digits present in a number recursively. 
//	Sample Input 1 :
//		 156
//		Sample Output 1 :
//		3
	
	public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}
	public static void main(String[] args) {
		 int n=534;
		 System.out.println(count(n));

	}

}
