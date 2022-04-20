package Array;
import java.util.Scanner;
public class Arrange_No_In_Array {

	public static void arrange(int[] arr , int n) {

		int i=0,j=n-1,k=1;
		while(i<j){
			arr[i]=k;
			k++;
			arr[j]=k;
			k++;
			i++;
			j--;
			if(i==j){
				arr[i]=k;
			}
		}
		for(int p = 0 ; p <n ; p++) {
			System.out.print(arr[p]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		 
		 arrange(arr, n);


	}

}
