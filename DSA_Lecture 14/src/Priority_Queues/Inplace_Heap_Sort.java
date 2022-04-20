package Priority_Queues;

//using this we can optimize the space ,its Space complexity should be O(1).
public class Inplace_Heap_Sort {

	//inserting the elements in the same given array according to heap order
	//Converting it into heap
	private static void insertIntoVirtualHeap(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex - 1) / 2;
		//upward Heapify
		while(childIndex > 0){
			if(arr[childIndex] < arr[parentIndex] ){
				//Swapping
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				return;
			}
		}

	}

	private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {

		int temp = arr[0]; // taking out the first element from the heap
		arr[0] = arr[heapSize - 1]; // inserting the last element of the heap in front
		heapSize--; // decreasing the size of the heap bcz we have removed one element from the heap
		int index = 0;
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
           // downward heapify
		while(leftChildIndex < heapSize){

			int minIndex = index;
			if(arr[leftChildIndex] < arr[minIndex]){
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
				minIndex = rightChildIndex;
			}
			if(minIndex != index){
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex]  = temp1;
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}else{
				break;
			}
		}
		return temp; // returning the minimum value 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,1,9,2,0,6};
		//inserting the elements in the heap
		for(int i = 0; i < arr.length; i++){
			insertIntoVirtualHeap(arr,i);
		}

		for(int i = 0; i < arr.length; i++){
			arr[arr.length - 1 - i] = removeMinFromVirtualHeap(arr, arr.length - i); // passing the array and the heap size
			//we are not taking any extra space to store the removed elements storing in the same array at its last index
			                                                     
		}

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
