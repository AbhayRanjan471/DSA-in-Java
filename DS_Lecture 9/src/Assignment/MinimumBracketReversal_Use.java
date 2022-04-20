package Assignment;
import java.util.Scanner;
public class MinimumBracketReversal_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter th bracket");
        String str = s.next();
        
      int num =  Minimum_brackect_Reversal.countBracketReversals(str);
        System.out.println("Minimum bracket Reversal required is "+num);
		
	}

}
