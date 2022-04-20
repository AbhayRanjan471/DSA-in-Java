//package Assignment;
//Given an array A and an integer K, print all subsets of A which sum to K.
//Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
//Note : The order of subsets are not important. Just print them in different lines.
//Input format :
//	Sample Input:
//		9 
//		5 12 3 17 1 18 15 3 17 
//		6
//		Sample Output:
//		3 3
//		5 1
package Assignment;
public class Print_Subset_Sum_to_K {
	
	public static void printSubsetsSumTok(int input[], int index ,String set , int Sumofset ,int k) {
		if(index == input.length) {
			if(Sumofset == k) {
				System.out.println(set );
			}
			return;
		}
		
		// when its part of set
		printSubsetsSumTok( input ,index +1 , set + input[index] +" " , Sumofset + input[index] ,k ); // here we have added the space also
		
		//when its not part of set
		printSubsetsSumTok( input ,index +1 , set  , Sumofset ,k );
	}

	public static void printSubsetsSumTok(int input[], int k) { 
		String set ="";
		int Sumofset = 0;
		int index =0;
		
		printSubsetsSumTok( input ,index , set , Sumofset ,k );
	}

	public static void main(String[] args) {
		 

		int input[] = {5,12,3,17,1,18,15,3,17};
		int k= 6;
		printSubsetsSumTok(input , k);
		 
	}

}
