
public class Quwstion1 {
	
	public static boolean splitArray(int arr[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return splitArray(arr,0,arr.length-1,0,0);
	}
    
    public static boolean splitArray(int[] arr,int start,int end,int lSum,int rSum){
		if(start>end){
			return lSum==rSum;		
		}
		if(arr[start] % 5==0){
			return splitArray(arr, start+1, end, lSum + arr[start], rSum);
		}
		else if(arr[start] %3==0){
			return splitArray(arr, start+1, end, lSum, rSum+arr[start]);
		}
		else{
			return splitArray(arr, start+1, end, lSum+arr[start], rSum) || splitArray(arr, start+1, end, lSum, rSum+arr[start]) ;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2};
         System.out.println(splitArray(n));
	}

}
