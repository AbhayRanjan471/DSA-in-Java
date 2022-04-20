package Priority_Queues;
import java.util.PriorityQueue; // using Inbuilt priority Queue

//Time Complex 0(nlogn)
public class In_build_PQ_and_K_sorted {
	
	public static void sortKSorted(int arr[] , int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();//creating a Priority Queue
		int i =0 ;
		//put 1st k elements in the Priority Queue
		for( ; i < k ; i++) {
			pq.add(arr[i]);// inserting the elements in the inbuilt Priority Queue in the same way as we are doing before by creating 
			           // an insert() function it will sort and add	              
		}
		for( ; i < arr.length ; i++) {
			arr[i - k] = pq.remove(); // removing the elements in the inbuilt Priority Queue in the same way as we are doing 
	                                  // before by creating an remove() function it will remove and sort	
			pq.add(arr[i]);
		}
		//for the remaining last (arr.lenght - k) element which are left to be removed 
		for(int j = arr.length - k ; j < arr.length ; j++) {
			arr[j] = pq.remove();
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,4,1,9,6,8};
		int k = 3;
		sortKSorted(arr, k);
		
		for(int i =0 ; i < arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
