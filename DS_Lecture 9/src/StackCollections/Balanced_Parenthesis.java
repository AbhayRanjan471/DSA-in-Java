package StackCollections;

import java.util.Stack;
//For a given a string expression containing only round brackets or parentheses, check if they are 
//balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
//	Sample Input 1 :
//	(()()())
//	Sample Output 1 :
//	true
//	Sample Input 2 :
//	()()(()
//	Sample Output 2 :
//	false

public class Balanced_Parenthesis {

	public static char pair(char c) {
		if(c == '}') {
			return '{';
		}
		if(c == ')') {
			return '(';
		}
		if(c == ']') {
			return '[';
		}
		return '\0';//null
	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();//creating a stack to store all the opening brackets
		for(int i=0 ; i< expression.length() ; i++) {
			char c = expression.charAt(i);
			if(c == '{' || c == '(' || c == '[') {
				stack.push(c);//inserting the brackets into the stack
			}
			else if(c == '}' || c == ')' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				if(pair(c) == stack.peek()) {
					stack.pop();
				}
			}
			else {
				return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
}
