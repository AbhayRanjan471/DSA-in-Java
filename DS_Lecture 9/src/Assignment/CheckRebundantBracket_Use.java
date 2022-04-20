package Assignment;
import java.util.Stack;
import java.util.Scanner;

public class CheckRebundantBracket_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the expression");
		String str = s.nextLine();
		
//		Stack<String> ch1 = new Stack<>();
//		ch1.push(str);
//		System.out.println(ch1.pop());
		
		boolean ch = Check_Rebundant_brackets.checkRedundantBrackets(str);
		System.out.println(ch);
		
	}

}
