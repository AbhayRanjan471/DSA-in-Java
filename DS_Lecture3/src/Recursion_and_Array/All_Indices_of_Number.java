package Recursion_and_Array;

public class All_Indices_of_Number {
	
	public static int[] findInteger(int input[], int x ,int arr[] ,int startIndex ,int i) {
		
		if(input[startIndex] == x) {
			arr[i] = startIndex;
			i++;
		}
		if(startIndex >= input.length -1) {
			return arr;
		}
		arr =findInteger(input , x, arr , startIndex +1 ,i);
		return arr;
	}
	
	public static void allIndexes(int input[], int x) {
		int i=0;
		int arr[] =new int[input.length];
		arr=findInteger(input , x , arr ,0 ,i);
		
		for(int j=0 ;j<arr.length ; j++) {
			if(j>0 && arr[j] ==0) {
				continue;
			}
			System.out.print(arr[j] +" ");
		}
		 
	}

	public static void main(String[] args) {
		 int input[]= {9,8,10,8,8};
		 int x=8;
		 allIndexes(input , x);
	}

}
