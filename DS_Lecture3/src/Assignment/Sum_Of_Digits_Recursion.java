package Assignment;

//Write a recursive function that returns the sum of the digits of a given integer.
//Sample Input 1 :
//12345
//Sample Output 1 :
//15

public class Sum_Of_Digits_Recursion {

	public static int sumOfDigits(int input){
		if(input == 0) {
			return 0;
		}
		int number=sumOfDigits(input / 10);
		int sum= number + input%10;
		return sum;
	}
	public static void main(String[] args) {
		 int n=9;
		 System.out.println(sumOfDigits(n));

	}

}
