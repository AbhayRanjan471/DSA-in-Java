//Given two integers a and b. You need to find and return the count of possible ways in which we can represent 
//the number a as the sum of unique integers raise to the power b.
//For example: if a = 10 and b = 2, only way to represent 10 as sum of unique integers raised to power 2 is-
//10 = 1^2 + 3^2 
//Hence, answer is 1.
//Note : x^y represents x raise to the power y

//Sample Input 2 :
//100 2
//Sample Output 2 :
//3
//Explanation:
//Following are the three ways: 
//1. 100 = 10^2
//2. 100 = 8^2 + 6^2
//3. 100 = 7^2+5^2+4^2+3^2+1^2

package Assignment;

public class All_Possible_ways {
	
	 // num is current num.
  public  static int countWaysUtil(int x, int n, int num)
    {
        // Base cases
        int val = (int) (x - Math.pow(num, n));
        if (val == 0)
            return 1;
        if (val < 0)
            return 0;
      
        // Consider two possibilities, num is
        // included and num is not included.
        return countWaysUtil(val, n, num + 1) +
               countWaysUtil(x, n, num + 1);
    }
      
    // Returns number of ways to express
    // x as sum of n-th power of two.
   public static int countWays(int x, int n)
    {
        return countWaysUtil(x, n, 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWays(100, 3));

	}

}
