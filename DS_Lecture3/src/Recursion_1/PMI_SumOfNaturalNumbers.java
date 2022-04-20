package Recursion_1;

public class PMI_SumOfNaturalNumbers {
	
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		int sumSeries=sum(n-1);
	
	return sumSeries + n;
}
	public static void main(String[] args) {
		 int n=4;
		 System.out.println(sum(n));

	}

}
