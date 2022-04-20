package SatckUsingLL;

import java.util.Stack;
//Use of Stack inbuilt function
public class StackCollections {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); // stack is already implemented class
	                                          // this will create stack for us
		int arr[] = {5,2,8,1};
		//TO PUSh
		for(int i=0 ; i< arr.length ; i++) {
			stack.push(arr[i]);
		}
		//TO POP
		while(! stack.isEmpty()) {
			 
			System.out.println(stack.peek());// to read the top most element
			stack.pop();
		}
	}

}
