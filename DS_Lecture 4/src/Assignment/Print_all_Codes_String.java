package Assignment;

//Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. 
//Write a program to print the list of all possible codes that can be generated from the given string.
//Note : The order of codes are not important. Just print them in different lines.
//Sample Input:
//	1123
//	Sample Output:
//	aabc
//	kbc
//	alc
//	aaw
//	kw

public class Print_all_Codes_String {
	
	public static void printAllPossibleCodes(String input ,String outputSofar) {
		if(input.length() == 0) {
			System.out.println(outputSofar);
			return;
		}
		else if(input.length() == 1) {
			char ch = input.charAt(0);
			
			if(ch == '0') { // eg : "023"
				return;
			}
			else {                  // this is the sort trick to bring out the integer value of a a prticular integer string
				int chv = ch -'0'; // chv :character value (it will bring out the integer value ,eg : '3' = 3
				char code = (char)('a' + chv - 1); // bring out the character value of the perticular integer
				outputSofar = outputSofar + code;
				System.out.println(outputSofar);
				
			}
		}
		else { // when (input.length() >2)
			char ch = input.charAt(0);
            String roi = input.substring(1); // roi: rest of the input
             
            if(ch == 0) {
            	return ;
            }
            else { // this one is for one character
				int chv = ch -'0'; // chv :character value (it will bring out the integer value ,eg : '3' = 3
				char code = (char)('a' + chv - 1); // bring out the character value of the perticular integer
				
				printAllPossibleCodes(roi , outputSofar + code);
            }
            
            String ch12 =input.substring(0,2); // ch12: first two character
            String outputSofar12 =input.substring(2);
            
            int ch12v= Integer.parseInt(ch12); // converting the string into its integer value
            
            if(ch12v <= 26) {
            	
            	char code =(char)('a' + ch12v -1);
            	
            	printAllPossibleCodes(outputSofar12 ,outputSofar +code);
            }
        }
	}
	
	public static void printAllPossibleCodes(String input) {
		String outputSofar ="";
		printAllPossibleCodes(input ,outputSofar);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="1123";
		printAllPossibleCodes(input);
	}

}
