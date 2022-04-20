package Assignment;

public class Count_Zero {

	public static int countZerosRec(int input){
		
		if(input == 0) { // this condition is besically when user input 0
			return 1;
		}
		if(input < 10 && input >0) {  // for the last recursion call eg:- 102 ->10 ->1 (here it will return zero)
			return 0;
		}
		int smallInput = countZerosRec(input /10);
		if(input % 10 == 0) {
			return smallInput + 1;
		}
		else {
			return smallInput;
		}
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=00;
	 
	System.out.println(countZerosRec(n));
	}

}
