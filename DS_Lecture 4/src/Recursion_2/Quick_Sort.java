package Recursion_2;

public class Quick_Sort {//wrong
	
	public static void quickSort(int input[] ,int startIndex ,int endIndex) {
		
		if(startIndex >= endIndex) {
			return;
		}
		 
		int pivotPos =Partition(input ,startIndex ,endIndex);
		
		quickSort(input ,startIndex , pivotPos -1);
		quickSort(input ,pivotPos +1 ,endIndex);
		
		
		
	}
	public static  int Partition(int[] input,int start,int end){
        int count=0;
        int pivot=input[start];
        for(int i=start+1;i<=end;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        int pivotIndex=start+count;
        int temp=input[pivotIndex];
        input[pivotIndex]=input[start];
        input[start]=temp;
        int i=start;
        int j=end;
        while(i<pivotIndex && pivotIndex<j){
            if(input[i]<=input[pivotIndex]){
                i++;
            }
            else if(input[j]>input[pivotIndex]){
                j--;
            }
             else{
                  temp=input[i];
                 input[i]=input[j];
                 input[j]=temp;
                 i++;
                 j--;
             }
        }
        return pivotIndex;
	}

	public static void main(String[] args) {
		 int input []= {9,18,19,10,2,11,6};
		 int endIndex =input.length -1;
		 quickSort(input , 0 , endIndex);

		 for(int i=0 ;i< input.length ;i++) {
				System.out.print(input[i]+" ");
		 }
	}

}
 