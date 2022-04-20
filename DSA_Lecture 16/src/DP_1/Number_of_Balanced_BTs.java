//Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the 
//count of possible binary trees which are balanced.
//This number can be huge, so, return output modulus 10^9 + 7.
//Time complexity should be O(h).

package DP_1;

public class Number_of_Balanced_BTs {
	
	//taking the mod
	public static int countBalancedBTs(int h){		
		int mod = (int)Math.pow(10, 9) + 7;
		return countBalancedBTs(h, mod);
	}
	
	public static int countBalancedBTs(int h, int mod){		
		
		if(h == 0 || h == 1){
			return 1;
		}
		
		int x = countBalancedBTs( h - 1);
		int y = countBalancedBTs(h - 2);
		long res1 = (long)x * x;
		long res2 = (long)x * y * 2; 
		int value1 = (int)(res1 % mod);
		int value2 = (int)(res2 % mod);
		return  (value1 + value2) % mod;
	}
	
	//Dynamic Programing
	public static int countBalancedBTsDP(int height){
		 int arr[]=new int[height+1];
	        arr[0]=1;
	        arr[1]=1;
	        
	        for(int i=2;i<=height;i++){
	            int val1=arr[i-1];
	            int val2=arr[i-2];
	            
	            
	            int mod=(int)Math.pow(10,9)+7;
	            long h1=(long)val1*val1;
	            long h2=(long)val1*val2*2;
	            
	            int res1=(int)(h1%mod);
	            int res2=(int)(h2%mod);
	            
	            arr[i]=(res1+res2)%mod;
	        }
	        
	        return arr[height];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int h = 7;
			long ans = countBalancedBTs(h);
			long ansDP = countBalancedBTsDP(h);
			System.out.println(ansDP);
			System.out.println(ans);
	}

}
