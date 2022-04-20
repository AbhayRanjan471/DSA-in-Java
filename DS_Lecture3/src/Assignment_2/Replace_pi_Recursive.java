package Assignment_2;
//Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
//Sample Input 1 :
//xpix
//Sample Output :
//x3.14x

public class Replace_pi_Recursive {

	public static String replace(String input){
		String output;
        if(input.length() <= 1)
            return input;
        
        String small = replace(input.substring(1));
        if(input.charAt(0) == 'p' && small.charAt(0) == 'i' ) {
            output = "3.14" + small.substring(1);
        }
        else 
        {
            output = input.charAt(0) + small;
        }
        return output;
        

	} 
	
	public static void main(String[] args) {
 
		String str ="xpix";
		System.out.println(replace(str));


	}

}
