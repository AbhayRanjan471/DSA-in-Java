package Assignment;

import java.util.Scanner;

//You have been given two integer arrays/list(ARR1 and ARR2) of size M and N, respectively. 
//You need to print their intersection; An intersection for this problem can be defined when
//both the arrays/lists contain a particular value or to put it in other words, when there 
//is a common value that exists in both the arrays/lists.

//Sample Input 2 :
//
//4
//2 6 1 2
//5
//1 2 3 4 2
//Sample Output 2 :
//2 1 2

public class Array_Intersection {
	
public static void intersections(int arr1[], int arr2[]) {
	//Your code goes here
    for(int i=0;i<arr1.length;i++){
        
        for(int j=0;j< arr2.length;j++){
            
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                    arr2[j]=-88;  //we are putting arr2[j]=-88 so that we cannot use the same no. twice
                break;  // ones we have got the matching no we will not check further
            }
        }
    }
}


	public static int[] takingInput(Scanner s,int arr[]) {
		 System.out.println("enter the elements in array1");
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 return arr;
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the size of array1");
		 int size1=s.nextInt();
		 
		 System.out.println("enter the size of array2");
		 int size2=s.nextInt();
		 int arr1[]=new int[size1];
		 int arr2[]=new int[size2];
		 
		
		 arr1=takingInput(s,arr1); //passing the Scanner also
		 arr2=takingInput(s,arr2);
		 
		 intersections(arr1,arr2);
		  
		  

	

	}

}
