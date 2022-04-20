package Priority_Queues;
import java.util.ArrayList;
import java.util.PriorityQueue;

//According to mam
public class K_largest_elements_Alternate {
	public static void  printKLargest(int arr[] , int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		for( ; i < k ; i++) {
			pq.add(arr[i]);
		}
		for( ; i < arr.length ; i++) {
			int min = pq.element(); // .element() will give us the minimum element in the priority Queue
			if(min < arr[i]) {
				pq.remove();//minimum element will be removed
				pq.add(arr[i]);
			}
		}
		while(! pq.isEmpty()) {
			System.out.print(pq.remove() +" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,15,8,9,12,13,20};
		printKLargest(arr , 3);

	}

}
