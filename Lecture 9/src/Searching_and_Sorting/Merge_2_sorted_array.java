package Searching_and_Sorting;

public class Merge_2_sorted_array {

	public static void main(String[] args) {
      int arr1[]= {2,6,9,15};
      int arr2[]= {1,4,6,7};
      int n =arr1.length+arr2.length;
     int arr3[]=new int[n];
     
     int i=0;
     int j=0;
     int k=0;
     
     while(i<arr1.length && j<arr2.length) {
   	  
   	  if(arr1[i]<arr2[j]) {
   		  arr3[k]=arr1[i];
   		  
   		  k+=1;
   		  i+=1;
   	  }
   	  else {               // in both condition it will come here when arr2[j]<arr1[i]  and when arr1[i]==arr2[j];
   		  arr3[k]=arr2[j];
   		 
   		  k+=1;
   		  j+=1;
   	  }}
   // 	  else if(arr1[i]==arr2[j]) {
   // 		  arr3[k]=arr1[i];
   // 		  arr3[k+1]=arr2[j];
   // 		  k=+2;
   // 		  i++;
   // 		  j++;
   // 	  }
   	  while(i<arr1.length) {
   		  arr3[k]=arr1[i];
   		  
   		  k+=1;
   		  i+=1;
   	  }
   	  while(j<arr2.length) 
   		  {
   		  arr3[k]=arr2[j];
   		  
   		  k+=1;
   		  j+=1;
   	  }
   	  for(int s=0;s<arr3.length;s++) {
   		  System.out.print(arr3[s]+" ");
   	  }
	}

}
