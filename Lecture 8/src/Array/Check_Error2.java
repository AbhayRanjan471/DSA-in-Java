package Array;

public class Check_Error2 {

	//public static void main(String[] args) {
		
//		 int[]arr=new int[5];
//		 arr=new int[6]; // the code will compile and run fine.this line assign new array to arr
		 
		  // next question
		
//		 int arr[] = new int[5];
//	      arr[1] = 10;
//	      arr = new int[2];
//	      System.out.println(arr[0]); //####arr initially refers to an array of size 5, line 2 assigns 10 to arr[1] but
	      //in line 3 arr is made to point to a new array of size 2. By default all elements of integer array are
	      //initialized to 0. Hence line 4 will print 0.

	      
	      //Nxt Question
	      
	//}

	 //Nxt Question
	
//	  public static void change(int input[]){
//		    input[0] = 15;
//		    }
//
//		    public static void main(String args[]){
//		        int arr[] = new int[5];
//		        change(arr);
//		        System.out.println(arr[0]); //####“arr” is a reference to the array, which contains address of the array.
		        //Hence we have passed this address to function “change”. Thus arr and input both refer to the 
		        //same array. Hence the statement input[0] = 15 changes the value of element at index 0 of the array to 15.
		   // }
	
	//Next Question
	
	   public static void change(int input[]){
		    input = new int[5];
		    input[0] = 15;
		    }

		    public static void main(String args[]){
		        int arr[] = new int[5];
		        change(arr);
		        System.out.println(arr[0]);//###“arr” is a reference to the array, which contains address of the array.
		        //Hence we have passed this address to function “change”. So input and arr will refer to same array initially,
		        //but in the first statement in function “change” input if made to refer to new integer array. So input[0] = 15,
		        //will change the first element of this newly formed array and the array created in main will remain unchanged
		    }
}
