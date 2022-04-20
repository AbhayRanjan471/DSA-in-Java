//For the given infinite supply of coins of each of denominations, D = {D0, D1, D2, D3, ...... Dn-1}. 
//You need to figure out the total number of ways W, in which you can make the change for Value V using coins of denominations D.
//Return 0 if the change isn't possible.
	//Sample Input 1 :
	//3
	//1 2 3
	//4
	//Sample Output 1 :
	//4
	//Explanation to Sample Input 1 :
	//Number of ways are - 4 total i.e. (1,1,1,1), (1,1, 2), (1, 3) and (2, 2).

package Assignment;

//Check Pep-coding
public class Ways_To_Make_Coin_Change {

	public static long countWaysToMakeChange(int denominations[], int value){

		int dp[] = new int[value + 1];
		dp[0] = 1; // there will be one way to pay 0 is dont't pay

		//we will calculate and store the no. of ways to pay each index of dp[] array till we reach the value that we have given
		for(int i =0 ; i < denominations.length ; i++) {
			for(int j = denominations[i] ; j < dp.length ; j++) {

				dp[j] += dp[j - denominations[i]]; //storing the no. of ways to pay
			}
		}
		return dp[value];
	}

	public static void main(String[] args) {
		int denominations[] = {1,2,3};
		int value = 4;
		System.out.println(countWaysToMakeChange(denominations, value));

	}

}
