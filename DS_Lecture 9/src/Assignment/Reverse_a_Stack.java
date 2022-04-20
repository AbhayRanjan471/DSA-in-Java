//You have been given two stacks that can store integers as the data. Out of the two given stacks, 
//one is populated and the other one is empty. You are required to write a function that reverses
//the populated stack using the one which is empty.
	//Sample Input 1:
	//6
	//1 2 3 4 5 10
	//Note:
	//Here, 10 is at the top of the stack.
	//Sample Output 1:
	//1 2 3 4 5 10

package Assignment;
import java.util.Stack;

public  class Reverse_a_Stack {
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        
        if(input.isEmpty()){
            return ;
        }
       
       int item = input.pop() ;
       
       reverseStack(input,extra) ;

       
       // removing elements from input and adding them to extra
       while(!input.isEmpty()){
           extra.push(input.pop()) ; // 1st poping out from input stack and the pushing it into extra Stack
       }
       
       input.push(item) ;
       
       // removing elements from extra and adding them to input
       while(!extra.isEmpty()){
           input.push(extra.pop()) ; ////1st poping out from extra Stack and then pushing it into input stack
       }
       
	}
	 
}
