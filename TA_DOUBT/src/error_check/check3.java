package error_check;

public class check3 {
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
          return allIndexes(input, 0, x , 0);
    }
	public static int[] allIndexes(int input[], int startIndex, int x , int i) {
		
//        if(startIndex == input.length){
//            int[] ans = new int[0];
//                return ans;
//        }
		if(startIndex >= input.length-1) {
			return input;
		}
        if(input[startIndex] == x) {
        	input[i] = startIndex;
        	i++;
        }
        int[] smallIndex = allIndexes(input, x, startIndex+1 , i);
//        if(input[startIndex] == x){
//            int[] myAns = new int [smallIndex.length+1];
//            myAns[0] = startIndex;
//        
//        }
//        if(input[startIndex+1] == x){
//            return startIndex+1;
//        }
        // if(input[input.length-1] == x){
        //     return input.length;
            return  input;
        // }
    }
	
	public static void main(String[] args) {
		int arr[] = {9,8,10,8,8};
		int arr1[] = new int[5];
		arr1 = allIndexes(arr, 8);
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i] );
		}
	}
}
