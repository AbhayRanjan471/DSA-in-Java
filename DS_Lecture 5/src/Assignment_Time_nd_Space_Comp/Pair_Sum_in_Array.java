package Assignment_Time_nd_Space_Comp;
//import java.util.Arrays;

public class Pair_Sum_in_Array {
	
	public static int pairSum(int[] arr, int num) {
		 int c=0;
	        for(int i=0;i<arr.length;i++){
	            
	            for(int j=i+1;j<arr.length;j++){
	                
	                if(arr[i]+arr[j]==num)
	                {
	                    c++;
	                    //break;
	                }
	            }
	        }
	        return c;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0,6,0,0};
		int num = 6;
		
		int pair = pairSum(arr , num);
		System.out.println(pair);

	}

}
