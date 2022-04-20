package Assignment_2;
//Write a recursive function to convert a given string into the number it represents. That is input
//will be a numeric string that contains only numbers, you need to convert the string into corresponding 
//integer and return the answer
//			Sample Input 1 :
//			00001231
//			Sample Output 1 :
//			1231
//			Sample Input 2 :
//			12567
//			Sample Output 2 :
//			12567

public class String_to_Integer {
	public static int convertStringToInt(String input){
		// Write your code here

        if(input.length() == 1){
        	char ch = input.charAt(0);// here we are converting the last character into integer
        	int n = ch -'0';
            return n ;
        }
 
       int smallAns=  convertStringToInt(input.substring(1)); // recursive call
       
       int length= input.length(); 
       char ch1 = input.charAt(0);
       int n1 = (int)((ch1 - '0') * Math.pow(10, length-1) + smallAns);  // 2*10^1 + 3 = 23 using this technique
        return n1;
	}
	public static void main(String[] args) {
		 String input ="1123";
		 System.out.println(convertStringToInt(input));

	}

}
