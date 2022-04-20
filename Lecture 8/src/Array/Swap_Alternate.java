package Array;

public class Swap_Alternate {

	public static void main(String[] args) {

//int arr[]=new arr[6];
int arr[]= {9,3,6,12,4,32,5,11};

for(int i=0;i<arr.length;i++) {
	
//	if(i+1 >arr.length-1)
//	{
//		int tem=arr[i];
//		arr[i]=arr[i-1];
//		arr[i-1]=tem;
//		break;
//	}
	if(i+1 >arr.length-1) {
		arr[i]=arr[i];
		break;
		
	}
	int temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
	i++;
	
	
}
for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+" ");


	}
	}

}
