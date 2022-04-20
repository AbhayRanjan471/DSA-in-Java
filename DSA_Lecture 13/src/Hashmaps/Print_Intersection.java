//You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively. You need to 
//print their intersection; An intersection for this problem can be defined when both the arrays/lists 
//contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
	//	Sample Input 1 :
	//	6
	//	2 6 8 5 4 3
	//	4
	//	2 3 4 7 
	//	Sample Output 1 :
	//	2
	//	3 
	//	4

package Hashmaps;
import java.util.HashMap;

public class Print_Intersection {
	
	public static void printIntersection(int[] arr1,int[] arr2){

        HashMap<Integer , Integer> map = new HashMap <>();
        // storing keys and values in the HashMap of arr1
        for(int i : arr1){
            if(map.containsKey(i)){
                map.put(i , map.get(i) + 1);
            }
            else{
            map.put(i , 1);
            }
        }
        //now iterating over arr2 and checking does the element matches with hashmap and the value its value is greater than
        // zero if yes then print the key and decrease its value by 1
       for(int j : arr2){
           if(map.containsKey(j) && map.get(j) > 0){
               System.out.println(j);
               map.put(j , map.get(j) -1);

           }
       }

	}

	public static void main(String[] args) {
		 int arr1[] = {2,6,8,5,4,3};
		 int arr2[] = {2,3,4,7};
		 printIntersection(arr1, arr2);

	}

}
