package Assignment;
//A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at
//a time. Implement a method to count how many possible ways the child can run up to the stairs. 
//You need to return number of possible ways W.
//Sample Input 1 :
//4
//Sample Output 1 :
//7

public class Staircase {
   
	public static int staircase_ways(int n){
		
		if(n == 0) {
			return 1;
		}
		if(n ==1 || n== 2) {
			return n;
		}
		return staircase_ways(n-1) + staircase_ways(n-2) + staircase_ways(n-3);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		System.out.println(staircase_ways(n));
	}

}
