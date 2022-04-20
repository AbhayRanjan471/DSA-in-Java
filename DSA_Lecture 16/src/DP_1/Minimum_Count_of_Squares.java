package DP_1;

public class Minimum_Count_of_Squares {
	
	//recursive approach
    public static int minCount(int n) {
    	if(n <= 3) {
    		return n;
    	}
    	int min = n;// this for the n = 4 :- 1^2 + 1^2 + 1^2+1^2 =4 that is the no, itself
    	
    	for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
    		int sqr = i*i;
    		if(sqr > n) {
    			break;
    		}
    		min = Math.min(min , 1+ minCount(n - sqr));
    	}
    	return min;
    }

    //Dynamic Programming
    public static int minCountDP(int n) {
    	if(n <= 3) {
    		return n;
    	}
    	int storage[] = new int[n+1];
    	storage[0] = 0;
    	storage[1] = 1;
    	storage[2] = 2;
    	storage[3] = 3;
    	
    	for(int i = 4 ; i <= n ; i++) {
    		int sqrValue = (int)Math.sqrt(i);// taking the Square root eg:-n = 5 => 2
    		int value = i - (int)(Math.pow(sqrValue, 2)); // then 5 - 2^2 = 1 //now we will find the value present at storage  index[value]
    		if(value == 0) { // if value is zero that means the no. i is perfect square root of any no
    			storage[i] = 1;  // so it will take count as 1
    			//return storage[n];
    		}
    		else {
    			storage[i] = 1 + storage[value];
    			//return storage[n];
    		}
    	}
    	return storage[n];
    }

	public static void main(String[] args) {
		 int n = 2;
		 System.out.println(minCount(n));
		 System.out.println((int)(Math.sqrt(n)));
		 System.out.println(minCountDP(n));

	}

}
