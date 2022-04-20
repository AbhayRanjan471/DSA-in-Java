package Assignment_Time_nd_Space_Comp;

public class Check_Array_Rotation {
	
	  public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
	        int index =0;
	        for(int i =0 ; i< arr.length -1 ; i++){
	            if( arr[i] > arr[i+1]){
	                index = i+1;
	                return index;
	            }
	        }
	        return index;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5 ,6,1,2,3,4};
		int index =arrayRotateCheck(arr);
		System.out.println(index);
	}

}
