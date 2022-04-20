package Assignment;
//Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S.
//Write a program to return the list of all possible codes that can be generated from the given string.
//Note : The order of codes are not important. And input string does not contain 0s.
//Sample Input:
//1123
//Sample Output:
//aabc
//kbc
//alc
//aaw
//kw

public class Return_all_Codes_String {
	
	public static String[] getCode(String input) {
        // Write your code here
        if (input.length() == 0) {
            // return new String[0];
            String[] myans = { "" };
            return myans;
        }
        
        // create first digit number
        int firstdigit = (input.charAt(0) - '0');
        String[] smallans1 = getCode(input.substring(1));
        String[] smallans2 = new String[0];
        int firsttwodigits = 0;
        // create two digit number 
        if (input.length() >= 2) {
            firsttwodigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if (firsttwodigits > 10 && firsttwodigits <= 26) {
                smallans2 = getCode(input.substring(2));
            }
        }
        
        String[] myans = new String[smallans1.length + smallans2.length];
        int k = 0;
        for (int i = 0; i < smallans1.length; i++) {
            char first = getchar(firstdigit);
            myans[k] = first + smallans1[i];
            k++;

        }
        for (int i = 0; i < smallans2.length; i++) {
            char first = getchar(firsttwodigits);
            myans[k] = first + smallans2[i];
            k++;
        }
        return myans;
    }

   

    public static char getchar(int n) {
        return (char)(96+n);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="1123";
		String[] str =getCode(input);
	
		for(int i=0 ;i<str.length ; i++) { // for printing the array
			System.out.println(str[i]);
		}
	 
		
	}

}
