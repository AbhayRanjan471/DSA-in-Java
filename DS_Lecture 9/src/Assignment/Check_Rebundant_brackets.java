//For a given expression in the form of a string, find if there exist any redundant brackets or not. 
//It is given that the expression contains only rounded brackets or parenthesis and the input expression 
//will always be balanced.
//A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.
//Example:
//Expression: (a+b)+c
//Since there are no needless brackets, hence, the output must be 'false'.
//
//Expression: ((a+b))
//The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.
	//Sample Input 1:
	//a+(b)+c 
	//Sample Output 1:
	//true
	//Sample Input 2:
	//(a+b)
	//Sample Output 2:
	//false 
package Assignment;
import java.util.Stack; // or import java.util.*;

public class Check_Rebundant_brackets {

	 public static boolean check( char ch ,Stack<Character>box){
	        int count = 0;
	        boolean isrebundant = false;
	        while(box.peek() != '('){
	        
	            box.pop();
	            count++;
	        }
	         if (box.peek() == '(' && count <= 1){
	            isrebundant = true;
	        }
	        
	        return isrebundant;
	    }

	    public static boolean checkRedundantBrackets(String expression) {
	        //Your code goes here
	        boolean isrebundant = false;
	        Stack<Character> box = new Stack<>();
	        for(int i =0 ; i < expression.length() ; i++){
	            char ch = expression.charAt(i);

	            if( ch != ')'){
	                box.push(ch);
	            }
	            else{
	               boolean ans= check(ch , box);
	                if(ans == true){
	                    isrebundant = true;
	                    return isrebundant;
	                }
	                else{
	                  
	                    box.pop();
	                }
	                
	            }

	        }
	        return isrebundant;
	    }
}
