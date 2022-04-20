package generic_Method;

public class Print {
	
	// making a generic function
	public static <T> void printArray(T arr[]) {
		for(int i=0 ; i< arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] =new Integer[10]; //  declaring an array of size 10
		for(int i =0 ; i< 10 ; i++) {
			arr[i] =i+1;
		}
		
		String str[] = new String[10]; //  declaring an array of size 10
		for(int i =0 ; i< 10 ; i++) {
			str[i] ="abc";
		}
		
		printArray(arr);// here we are passing integer to the function
		printArray(str);// here we are passing String to the same function
	}

}
