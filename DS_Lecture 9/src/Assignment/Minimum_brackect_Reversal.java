//For a given expression in the form of a string, find the minimum number of brackets that can be reversed 
//in order to make the expression balanced. The expression will only contain curly brackets.
//If the expression can't be balanced, return -1.
//Example:
//Expression: {{{{
//If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since
//we have to reverse two brackets to make the expression balanced, the expected output will be 2.
//
//Expression: {{{
//In this example, even if we reverse the last opening bracket, we would be left with the first
//opening bracket and hence will not be able to make the expression balanced and the output will be -1.
	//Sample Input 1:
	//{{{
	//Sample Output 1:
	//-1
	//Sample Input 2:
	//{{{{}}
	//Sample Output 2:
	//1
package Assignment;
import java.util.Stack;

public class Minimum_brackect_Reversal {

	public static int countBracketReversals(String input) {
		//Your code goes here
        int count = 0;
        int length = input.length();
        if(length % 2 != 0){ // when the length is odd the expression will not get balaneced
            return -1;
        }
        Stack<Character> stack = new Stack<>(); //creating a stack in which all the brcaket will be stored
        for(int i =0 ; i< length ; i++){
            char ch = input.charAt(i);
            
            if(ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){ // for eg :- }}
                    stack.push(ch);
                }
                else if( ! stack.isEmpty() && stack.peek() == '}'){ // eg:- }}}}
                    stack.push(ch);
                }
                else if(! stack.isEmpty() && stack.peek() == '{'){ // eg:- }}{
                    stack.pop();
                }
            }
        }
        while(! stack.isEmpty()){
           
            //poping out two charcter and then comparing
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            
            if(ch1 != ch2){ //eg:- }{ in this case we have to reverse both the bracket so the count is incresed by 2
                count += 2;
            }
            else{ // eg:- {{ or }}
                count +=1;
            }
        }
        return count;
	}
}
