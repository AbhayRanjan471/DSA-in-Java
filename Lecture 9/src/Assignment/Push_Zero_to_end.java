package Assignment;

import java.util.Scanner;

//You have been given a random integer array/list(ARR) of size N. You have been 
//required to push all the zeros that are present in the array/list to the end
//of it. Also, make sure to maintain the relative order of the non-zero elements.

//Sample Input 1:
//
//7
//2 0 0 1 3 0 0
//Sample Output 1:
//2 1 3 0 0 0 0

public class Push_Zero_to_end {
	
	 public static void pushZerosAtEnd(int[] arr) {
		 //1st method
         int n = arr.length;
    int i =0;
    int j =0;
  
    int temp[] = new int[n];// making an array of size n to store all the elemnts 
                           //  except zero and at last the last remaing space zero will be store by default
    
    while(i<n)
    {
        if(arr[i]!=0)
        {
            temp[j]=arr[i];
            i++;
            j++;
        }
        else{
            i++;
        }
       
    }
   
for(int z =0;z<n;z++)
    {
       System.out.print( (arr[z]=temp[z])+" ");//storing the elements of temp[] in Array arr[]
    }
	 }

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the size of array");
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 System.out.println("enter the elements array");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 pushZerosAtEnd(arr);
		 

	}

	}

  // second method
	
//  public static int[] pushZerosAtEnd(int[] arr) {
//     int j=0;
// int n=arr.length;
// for(int i=0;i<n;i++)
// {
//     if(arr[i]!=0)
//     {
//         int temp=arr[i];
//         arr[i]=arr[j];  // pussing the array to the last
//         arr[j]=temp;
//        
//         j++;
//     }
// }
// return arr;
// 
//}
//public static void main(String[] args) {
//	
//	 Scanner s=new Scanner(System.in);
//	 
//	 System.out.println("enter the size of array");
//	 int size=s.nextInt();
//	 int arr[]=new int[size];
//	 System.out.println("enter the elements array");
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i]=s.nextInt();
//	 }
//	 arr= pushZerosAtEnd(arr);
// 
//	 for(int j=0;j<size;j++) {   // printing the array
//		 System.out.print(arr[j]);
//	 }
//
//}
//}
