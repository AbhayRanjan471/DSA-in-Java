package Assignment;

//Given an integer array (of length n), find and return all the subsets of input array.
//Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
//Note : The order of subsets are not important.
//Input format :
//
//Line 1 : Size of array
//
//Line 2 : Array elements (separated by space)
//
//Sample Input:
//3
//15 20 12
//Sample Output:
//[] (this just represents an empty array, don't worry about the square brackets)
//12 
//20 
//20 12 
//15 
//15 12 
//15 20 
//15 20 12 

public class Return_Subset_of_an_Array {
	
	  public static int[][] subsets(int input[], int start_index){
	        if(start_index == input.length){
	            int a[][] = new int[1][0];
	            return a;
	        }
	        
	        int small_arr[][] = subsets(input, start_index +1);
	        int ans[][] = new int[2 * small_arr.length][]; //        int ans[][] = new int[2 * small_arr.length][]; // here we are only giving the 
	                                                         //size of row bcz we are going to use theconcept of jagged array

	        int k = 0;
	        for(int i=0 ; i<small_arr.length ; i++) //   // small_arr.length ,which is the length of the row

	        {
	            ans[k]=new int[small_arr[i].length];
	            
	            for(int j=0 ; j<small_arr[i].length ; j++){  //              // bsically here we are copying the previous arrray
	                ans[k][j] = small_arr[i][j];
	            }
	            k++;
	        }
	  
	        for(int i =0 ; i<small_arr.length ; i++)
	        {
	            ans[k]=new int[small_arr[i].length+1];
	            
	            ans[k][0] = input[start_index];
	            
	            for(int j=1 ; j<ans[i].length+1 ; j++){
	                ans[k][j] = small_arr[i][j-1]; 
	            }
	            k++;
	        }
	        return ans;
	    }

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input [] = {15 ,20 ,12};
		int ans[][] =subsets(input ,0);
		
	// printing the array
		for( int i=0 ;i< ans.length ; i++) {
			for(int j=0 ;j < ans[i].length ; j++) { // here we are printing the jagged array so we have to use the printing process of jagged array
				
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
