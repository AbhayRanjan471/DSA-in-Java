//You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.
//Note: Take absolute difference between the elements of the array.
//	Sample Input 1 :
//	4 
//	5 1 2 4
//	3
//	Sample Output 1 :
//	2
//	Sample Input 2 :
//	4
//	4 4 4 4 
//	0
//	Sample Output 2 :
//	6

package Assignment;
import java.util.HashMap;
import java.util.Scanner;

public class Pair_with_difference_K {
	
	 public static int getPairsWithDifferenceK(int arr[], int k) {
	        //Write your code here
	        int count = 0;
	        //inserting the elements in the HashMap
	        HashMap<Integer , Integer> map = new HashMap<>();
	        for(int i : arr){
	            if(map.containsKey(i)){
	                map.put(i , map.get(i)+1);
	            }
	            else{
	                map.put(i , 1);
	            }
	        }
	        //here we are handling the case when (k != 0)
	        if(k != 0){
	            for(int i : arr){
	                int x = i - k; // we will subtract the 'i'th element with k and check does that value is present in the map
	                if(map.get(i) > 0){
	                    if(map.containsKey(x)){
	                        count += map.get(x);
	                          
	                    }
	                }
	            }
	        }
	        //case for k=0
	        if(k == 0){ //in that case, count would add to nC2  ,nC2=n(n-1)/2
	            for(int i : arr){
	                int x = i - k;
	            // count +=Math.pow(map.get(x) , 2);
	                count +=map.get(x)*(map.get(x)-1)/2;
	                break;
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter the elements in the Array");
		 for(int i =0 ; i < size ;i++) {
			 arr[i] = s.nextInt();
		 }
		 System.out.println("Enter the integer K");
		 int k = s.nextInt();
		 
		 int pair = getPairsWithDifferenceK(arr, k);
		 System.out.println("Total no. of such pairs which have difference K is \n" + pair);

	}

}
