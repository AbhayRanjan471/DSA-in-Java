//You are given two strings S and T of lengths M and N, respectively. Find the 'Edit Distance' between the strings.
//Edit Distance of two strings is the minimum number of steps required to make one string equal to the other. 
//In order to do so, you can perform the following three operations:
//1. Delete a character
//2. Replace a character with another one
//3. Insert a character
	//Sample Input 1 :
	//abc
	//dc
	//Sample Output 1 :
	//2


package DP_2;

public class Edit_Distance {

	//Recursive approach
	public static int editDistance(String str1, String str2){


		if(str1.length() == 0) {
			return str2.length(); // if any of the string length is 0 then the minimum edit we have do to to make both the String 
			// equal is the lenght of the next string 
		}
		if(str2.length() == 0) {
			return str1.length();
		}

		if(str1.charAt(0) == str2.charAt(0)) {
			return editDistance(str1.substring(1), str2.substring(1));
		}
		else {
			// insert
			int opt1 = editDistance(str1, str2.substring(1));
			// delete
			int opt2 = editDistance(str1.substring(1), str2);
			// Substitute
			int opt3 = editDistance(str1.substring(1), str2.substring(1));

			return 1 + Math.min(opt1, Math.min(opt2, opt3));

		}

	}

	//Memoizaton
	public static int editDistanceM(String str1, String str2){
		int storage[][] = new int[str1.length() + 1][str2.length() + 1];
		//initially inserting -1 in the 2D array
		for(int i = 0 ; i <= str1.length() ; i++){
			for(int j =0 ; j <= str2.length() ; j++){
				storage[i][j] = -1;
			}
		}
		return editDistanceM(str1, str2 , storage);
	}

	public static int editDistanceM(String str1, String str2, int[][] storage) {
		int m = str1.length();
		int n = str2.length();

		if(storage[m][n] != -1){
			return storage[m][n];
		}

		if(str1.length() == 0) {
			storage[m][n] = str2.length();
			return storage[m][n]; // if any of the string length is 0 then the minimum edit we have do to to make both the String 
			// equal is the lenght of the next string 
		}
		if(str2.length() == 0) {
			storage[m][n] = str1.length();
			return storage[m][n];
		}

		if(str1.charAt(0) == str2.charAt(0)) {
			storage[m][n] = editDistanceM(str1.substring(1), str2.substring(1) , storage);

		}
		else {
			// insert
			int opt1 = editDistanceM(str1, str2.substring(1) , storage);
			// delete
			int opt2 = editDistanceM(str1.substring(1), str2 , storage);
			// Substitute
			int opt3 = editDistanceM(str1.substring(1), str2.substring(1) , storage);

			storage[m][n] = 1 + Math.min(opt1, Math.min(opt2, opt3));

		}
		return storage[m][n];
	}

	//Dynamic Programming
	public static int editDistanceDP(String str1, String str2){
		int m = str1.length();
		int n = str2.length();
		int storage[][] = new int[ m + 1][n + 1];
		for(int j = 0; j <= n; j++){ // storing the value of 1st row 
			storage[0][j] = j;
		}
		for(int i = 0; i <= m; i++){ // storing the value of 1st column
			storage[i][0] = i;
		}
         // for rest of the index
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				if(str1.charAt(m - i) == str2.charAt(n - j)){
					storage[i][j] = storage[i - 1][j - 1];
				}else{
					storage[i][j] = 1 + Math.min(storage[i][j - 1], 
							Math.min(storage[i - 1][j], storage[i - 1][j - 1]));
				}
			}
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		String str1 = "Zeildhvdv";
		String str2 = " trialddh";
		System.out.println(editDistanceDP(str1, str2));
		System.out.println(editDistanceM(str1, str2));
		System.out.println(editDistance(str1, str2));
		

	}

}
