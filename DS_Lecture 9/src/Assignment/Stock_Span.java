//Afzal has been working with an organization called 'Money Traders' for the past few years. The organization is 
//into the money trading business. His manager assigned him a task. For a given array/list of stock's prices
//for N days, find the stock's span for each day.
//The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and 
//going backwards) for which the price of the stock was less than today's price.
//For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the 
//stock spans will be [1, 1, 1, 2, 1, 4, 6].
	//Sample Input 2:
	//8
	//60 70 80 100 90 75 80 120
	//Sample Output 2:
	//1 2 3 4 1 1 2 8 

package Assignment;

import java.util.*;
public class Stock_Span {

	public static void print(int[] output) {
		System.out.print("the stock span for " + output.length +" days\n");
		for(int i = 0 ; i < output.length ; i++) {
			System.out.print(output[i] +" ");
		}
		System.out.println();
	}
	//using Stack
	public static int[] stockSpan(int[] price) {
		Stack<Integer> stk = new Stack<>();
		int n = price.length;
		int output [] = new int[n];
		stk.push(0);
		output[0] = 1;

		for(int i = 1 ; i < n ; i++) {
			while(! stk.isEmpty() && price[stk.peek()] < price[i]) {
				stk.pop();
			}
			if(stk.isEmpty()) {
				output[i] = i + 1;
			}
			else {
				output[i] = i - stk.peek();
			}
			stk.push(i);
		}
		return output;
	}

	//using array
	public static int[] stockSpanIterative(int[] price) {
		//Your code goes here
		int arr[] = new int[price.length];
		arr[0] = 1;
		for(int i =1 ; i < price.length ; i++){
			int c =1 ;
			int j =i;
			while(j > 0 &&price[i] > price[j-1] ){
				c++;
				j--;
			}
			arr[i] = c;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of days");
		int days = s.nextInt();
		int price[] = new int[days];
		System.out.println("Enter the price of the Stock for " + days+" days");
		for(int i = 0 ; i < days ; i++) {
			price[i] = s.nextInt();
		}

		int output[] = stockSpanIterative(price);
		print(output);

		int output2[] = stockSpan(price);
		print(output2);

	}

}
