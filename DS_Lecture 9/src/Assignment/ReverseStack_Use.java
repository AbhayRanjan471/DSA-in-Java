 
package Assignment;
import java.util.Stack; // importing the stack class bcz of which we can use the function of inbuild  Stack class
import java.util.Scanner;
// import java.util.* // we can use this instead of importing all the class (sortcut method)

public class ReverseStack_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
	 
		//creating an object of Stack class through which we can use all the function of Stack class 
		// and we need not need to create push() , pop() ,Empty() ..etc its already created in Stack class 
		// we just need to import that Stack class and create an object of that class and we are free to use all its function
		Stack<Integer> stack = new Stack<Integer>(); // creating an object of Stack class
		for(int i = 0 ; i< 5 ; i++) {
			stack.push(i); // we are calling the push function of inbuild Stack class and inserting the value 'i' in the stack
  	 
		}
		
		Stack<Integer> empty = new Stack<Integer>();  
		Reverse_a_Stack.reverseStack(stack, empty); // calling the reverseStack function
		//class name . function name();
		
		    // OR (we can create object of the Reverse_a_Stack class and the call its function as we have done below)
//		Reverse_a_Stack obj1 = new Reverse_a_Stack();
//		obj1.reverseStack(stack, empty);
		
		
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
