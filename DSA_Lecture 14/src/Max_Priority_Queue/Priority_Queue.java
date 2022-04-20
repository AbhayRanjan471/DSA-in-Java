package Max_Priority_Queue;

import java.util.ArrayList;

public class Priority_Queue {

	//heap is completely stored in an  array
	private ArrayList<Integer> heap;

	public Priority_Queue() {
		heap = new ArrayList<>();
	}

	boolean isEmpty(){
		return heap.size() == 0;
	}

	int size(){

		return heap.size();
	}

	int getMax() throws PriorityQueueException{
		if(isEmpty()){
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	public void insert(int element){

		 // Implement the insert() function here
        heap.add(element); // here we have inserted the element in the ArrayList
        // now we have to heapify to arrange the heap according to its rule 
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        // inserting the elements and doing UpwardHeapify
        while(childIndex > 0){
            if(heap.get(childIndex) > heap.get(parentIndex)){
                // swapping
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                //updating the index of child and parent
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
            else{
                return;
            }
        }
	}
	int removeMax() throws PriorityQueueException {
		
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		int temp = heap.get(0); // stored the element of index 0
		heap.set(0 ,  heap.get(heap.size()-1)); // set the last index element in index 0
		heap.remove(heap.size()-1); // reove the last index

		// now we have to do downwardHeapify
		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		while(leftChildIndex < heap.size()) {

			if(heap.get(leftChildIndex) > heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(minIndex)) {
				minIndex = rightChildIndex;
			}
			if(minIndex == index) {
				break;
			}
			else {
				//now swapping
				int temp1 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp1);

				// updating the index 
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return temp;
	}

}