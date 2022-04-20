package Searching_and_Sorting;

public class Selection_Sort {
	public static void selectionSort(int []input) {
		
		for(int i=0;i<input.length-1;i++) {
			int min=input[i];
			int minIndex=i;
			
			for(int j=i+1;j<input.length-1;j++) {
				
				if(input[j]<min) {
					 min=input[j];
					minIndex=j;  // we store  the index so that we get to know at which position we have to swap
				}
			}
			if(minIndex !=i) {// this condition is besically when we get 2 !=2 ,3!=3 , at this time we need not need to swap bcz it is of no use
				input[minIndex]=input[i];// here we are swapping 
				input[i]=min;
				
				//Or
//				int temp=input[minIndex];
//				input [minIndex]=input[i];
//				input[i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int input[]= {2,6,9,1,5};
		 selectionSort(input);
		 
		 for(int i=0;i<input.length;i++) {
			 System.out.print(input[i]+" ");
		 }
		 

	}

}
