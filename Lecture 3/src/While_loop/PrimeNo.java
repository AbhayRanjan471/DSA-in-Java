package While_loop;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i=2;
    
    while(i<=n-1) {
    	if(n % i==0) {
    		System.out.println("not prime");
    		return;
    	}
    	i++;
    }
    System.out.println("prime");
	}

}
