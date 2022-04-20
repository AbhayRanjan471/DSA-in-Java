package Function;
import java.util.Scanner;
public class PrintPrime_Till_N {
	
	public static boolean isPrime(int n) {
		int d=2;
		while(d<n)
		{
			if(n % d == 0) {
				return false; //step 3:it will return to line 20
			}                  // OR
			d++;
		}return true;  ///step 3:it will return to line 20
	}

	public static void printPrime(int n)
	{
		for(int i=2;i<=n;i++) {
			//need to check if 'i' is prime or not
			boolean isIprime=isPrime(i); //step 2:this function will go to the line 5 nd there it will do its process
			
			if(isIprime) {         //step 4:after compilting the hole process of above function this line will be exicute
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
     printPrime(n);  //step 1:this function will  go to the line 16 nd there it will do some process
     
     System.out.println("back in main");  //step 5:at last thi line will be exicute after all the function complete there process

	}

}
