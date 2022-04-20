package DP_2;

 

public class Lowest_Common_Subsequence {
	
	//Recursively
	public static int LCS(String str1 , String str2) {
		
		if(str1.length() == 0 || str2.length() == 0) { // when any of the string is empty then there will be no LCS
			return 0;
		}
		
		if(str1.charAt(0) == str2.charAt(0)) { //when the 1st character of both the string are matched  
			return 1 + LCS(str1.substring(1) , str2.substring(1));//calling over rest of the String through recursion
		}
		//when 1st character of both the string doen't match then we have Three option
		else {
			int op1 = LCS(str1 , str2.substring(1)); //String of str1 will be kept as it is and the 1st character of the
			                                        //string of str2 will be ignored
			int op2 = LCS(str1.substring(1) , str2); //the 1st character of the string of str1 will be ignored and 
                                                    // String of str2 will be kept as it is
		 
			
			// We will keep the maximum out of all this option
			return Math.max(op1,op2);
		}
	}
	
	//Memoziation
	public static int LcsM(String str1 , String str2) {
		int str1Len = str1.length();
		int str2Len = str2.length();
		int storage[][] = new int [str1Len + 1][str2Len + 1];
		
		for(int i =0 ; i < str1Len + 1 ; i++) {
			for( int j =0 ; j < str2Len + 1 ; j++) {
				storage[i][j] = -1;
			}
		}
		return LcsM(str1 , str2 , storage);
	}

	public static int LcsM(String str1, String str2, int[][] storage) {
		int m = str1.length();
		int n = str2.length();
		
		if(storage[m][n] != -1) {
			return storage[m][n];
		}
		if(m == 0 || n == 0) {
			storage[m][n] = 0;
			return storage[m][n];
		}
		if(str1.charAt(0) == str2.charAt(0)) {
			storage[m][n] = 1 + LcsM(str1.substring(1), str2.substring(1) , storage);
		}
		
		else {
			int opt1 = LcsM(str1, str2.substring(1) , storage);
			int opt2 = LcsM(str1.substring(1), str2 , storage);
			storage[m][n] = Math.max(opt1, opt2);
			
		}
		return storage[m][n];
	}
	
	//Dynamic Programming
	public static int LcsDP(String str1 , String str2) {
		int  m = str1.length();
		int n = str2.length();
		int storage[][] = new int[m + 1][n + 1];
		
		//Adding 0 in the 1st row and the 1st column
		for(int i = 0 ; i <= m ; i++) {
			storage[i][0] = 0;
		}
		for(int i = 0 ; i <= n ; i++) {
			storage[0][i] = 0;
		}
		
		 //Now we have to fill the remaining cells
		for(int i = 1 ; i <= m ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				if(str1.charAt(m - i) == str2.charAt(n - j)) {
					 storage[i][j] = 1 + storage[i - 1][j - 1];
				}
				else {
					storage[i][j] = Math.max(storage[i][j - 1], storage[i - 1][j]);
				}
			}
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		 String str1 = "xyz";
		 String str2 = "axy";
		 System.out.println(LcsDP(str1, str2));
		 System.out.println(LcsM(str1, str2));
		 System.out.println(LCS(str1, str2));

	}

}
