package StackCollections;

import java.util.Stack; // importing inbuilt stack function
//Use of Stack inbuilt function
public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
