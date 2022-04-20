package Array;

public class ArrayUse {

	public static void main(String[] args) {
		 
			int n = 10;
			
			int[] arr = new int[n];
		    arr[0] = 15;              //we r assigning value 15 at index 0
			System.out.println(arr[0]);
			System.out.println(arr[5]);  //we have not assign any value at index 5 so, by default it store 0
			
			char chArray[] = new char[11];
			chArray[0] = 'a';
			double dArray[] = new double[12];
			dArray[0] = 1.2;
			System.out.println(chArray[0]);
			System.out.println(dArray[0]);
			
		}

	}


