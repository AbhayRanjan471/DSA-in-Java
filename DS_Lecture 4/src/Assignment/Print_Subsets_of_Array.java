package Assignment;

import java.io.DataInput;

//Given an integer array (of length n), find and print all the subsets of input array.
//Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements
//should remain same as in the input array.
//Note : The order of subsets are not important. Just print the subsets in different lines.
//Input format :
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

public class Print_Subsets_of_Array {
	public static void printSubsets(int input[] , int index ,String set) {
		if(index == input.length) {
			System.out.println(set );
			return;
		}

		// when its part of set
		printSubsets( input ,index +1 , set + input[index] +" " ); // here we have added the space also

		//when its not part of set
		printSubsets( input ,index +1 , set  );
	}

	public static void printSubsets(int input[], int index) { 
		String set ="";
		printSubsets( input ,index , set  );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input [] = {15 ,20 ,12};
		int index =0;
		printSubsets(input ,index);
	}

}
