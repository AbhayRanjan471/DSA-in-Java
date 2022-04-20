//Gary has two string S and V. Now, Gary wants to know the length shortest subsequence in S, which is not a subsequence in V.
//Note: The input data will be such that there will always be a solution.
//Sample Input 1:
//babab
//babba
//Sample Output 1:
//3
//Explanation:
//"aab" is the shortest subsequence which is present in S and absent in V.

package Assignment;

public class Shortest_Subsequence {

	static int INF = 1000000000;
	static int dp[][];
	static int next[][];

	public static int solveHelper(String S,String V){

		 int n = S.length();
	        int m = V.length();
	        int i , j , prev;
	        dp = new int[n+1][m+1];
	        next =new int[n+1][m+1];
	        for(i = 0 ; i < n ; i++){
	            prev = -1;
	            for(j =0 ; j < m ; j++){
	                if(S.charAt(i) == V.charAt(j)){
	                    prev = j ;
	                   
	                }
	                 next[i+1][j+1] = prev;
	            }
	        }
	        for(i = 1 ; i <= n ; i++){
	            dp[i][0] = 1;
	        }
	         for(i = 0 ; i <= m ; i++){
	            dp[0][i] = INF;
	        }
	        for(i = 1; i <= n ; i++){
	            for(j = 1; j <= m ; j++){
	                if(next[i][j] == -1){
	                    dp[i][j] = 1;
	                }
	                else{
	                    dp[i][j] = Math.min(dp[i-1][j] , 1 + dp[i-1][next[i][j]]);
	                }
	            }
	        }
		return dp[n][m];
		//System.out.println(dp[m][n]);

	}

	public static void solve(String S,String V){
		System.out.println(solveHelper(S, V));
	}
	public static void main(String[] args) {
		String S = "abaac";
		String V = "bacc";
		solve(S,V);
//		System.out.println(solve(S,V));

	}

}
