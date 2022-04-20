package Recursion_2;

public class Print_Keypad_Combination_code {

	public static void keypad(int n ,String outputSofar){

		if(n ==0) {
			System.out.println(outputSofar);
			return;
		}

		String smallAns[] = helper(n % 10); // recursive call

		for(int i=0 ;i<smallAns.length ;i++) {

			keypad(n/10 ,smallAns[i] + outputSofar);
		}
	}

	public static void keypad(int n ){
		keypad(n ,"");

	}

	public static String[] helper(int n) {
		if(n==2){
			return(new String[]{"a","b","c"});
		}
		else if(n==3){
			return(new String[]{"d","e","f"});
		}
		else if(n==4){
			return(new String[]{"g","h","i"});
		}
		else if(n==5){
			return(new String[]{"j","k","l"});
		}
		else if(n==6){
			return(new String[]{"m","n","o"});
		}
		else if(n==7){
			return(new String[]{"p","q","r","s"});
		}
		else if(n==8){
			return(new String[]{"t","u","v"});
		}
		else if(n==9){
			return(new String[]{"w","x","y","z"});
		}
		else{
			return(new String[]{" "});
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 729;
		keypad(n);
	}

}

