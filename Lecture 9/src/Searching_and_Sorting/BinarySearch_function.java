package Searching_and_Sorting;
import java.util.Scanner;
public class BinarySearch_function {
	public static int indexOf( int arr[],int n) {
		int x=n;
		 int start=0;
	        int end=arr.length -1;
	        int mid;
	        int temp=-1;
	        
	        while(start<=end){
	            mid=(start+end)/2;
	            
	            if(x==arr[mid]){
	                temp=mid;
	                break;
	            }
	            else if(x>arr[mid]){
	                start=mid+1;
	            }
	            else {       //if (x < arr[mid]){
	                end=mid-1;
	            }
	            
	            
	            
	        }
	        return temp;
	    }
		
	
	
	public static int[] takingInput(Scanner s) {
		
		System.out.println("enter the size of the array");
		
		 int size=s.nextInt();
		
		 int arr[]=new int[size];
		 
		 System.out.println("enter the elements in array");
		 
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 return arr;
		 
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the no. to be search");
		 
		 int search=s.nextInt();
		 int arr[]=takingInput(s);
		int index= indexOf(arr,search);
		System.out.println("the index point of the element is \n"+ index);
		 

	}

}
