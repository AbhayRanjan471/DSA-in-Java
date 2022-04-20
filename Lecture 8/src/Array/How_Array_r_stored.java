package Array;

public class How_Array_r_stored {
	public static void print(int input[]) {
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	
	public static void incrementArray( int input[]) {
		for(int i=0;i<input.length;i++)
		{
			input[i]++;
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		incrementArray(arr);
		print(arr);
		 

	}

}
