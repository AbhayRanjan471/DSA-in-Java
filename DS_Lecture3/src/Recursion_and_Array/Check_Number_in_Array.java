package Recursion_and_Array;

//Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
//Do this recursively.

public class Check_Number_in_Array {
	
	public static boolean checkNumber(int input[], int x) {
		if(input[0] ==x){
            return true;
        }
        if(input.length <=1){
            return false;
        }
        int smallInput[] =new int[input.length -1];
        for(int i=1 ;i<input.length ;i++){
            smallInput[i-1] = input[i];
            
        }
      return checkNumber(smallInput ,x);
        
		
	}

	public static void main(String[] args) {
		 int arr[]= {3,4,1,5};
         int x=3;
         boolean ispresent =checkNumber(arr,x);
         System.out.println(ispresent);
	}

}
