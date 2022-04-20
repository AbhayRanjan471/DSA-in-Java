//You are given a stream of 'N' integers. For every 'i-th' integer added to the running list of integers, print the resulting median.
//Print only the integer part of the median.
//	Sample Input 1 :
//	6
//	6 2 1 3 7 5
//	Sample Output 1 :
//	6 4 2 2 3 4
//	Explanation of Sample Output 1 :
//	S = {6}, median = 6
//	S = {6, 2} -> {2, 6}, median = 4
//	S = {6, 2, 1} -> {1, 2, 6}, median = 2
//	S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
//	S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
//	S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4

package Assignment;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

public class Running_Median {
	
	public static void findMedian(int arr[])  {
        if(arr.length==0)
            return;
        int med=arr[0];
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min=new PriorityQueue<>();
        max.add(arr[0]);
        System.out.print(med+" ");
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            if(max.size()>min.size()){
                if(x<med){
                    min.add(max.remove());
                    max.add(x);
                }
                else{
                    min.add(x);
                    
                }
                med=(max.peek()+min.peek())/2;
                
            }
            else if(max.size()==min.size()){
                if(x<med){
                    max.add(x);
                    med=max.peek();
                }
                else{
                    min.add(x);
                    med=min.peek();
                }
            }
            else {
                if(x>med){
                    max.add(min.remove());
                    min.add(x);
                }
                else{
                    max.add(x);
                }
                med=(max.peek()+min.peek())/2;
                
            }
            System.out.print(med+" ");
        }
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of the Array");
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter the elements in The Array");
		 for(int i =0 ; i < size ; i ++) {
			 arr[i] = s.nextInt();
		 }
		 findMedian(arr);

	}

}
