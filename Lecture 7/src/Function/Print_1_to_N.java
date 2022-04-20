package Function;
import java.util.Scanner;
public class Print_1_to_N {
	//void:- when a function doesn't return anything we write it's output as void. 
	public static void printTillN(int n) {
		             // if our function is "void" we can just say return
		if(n<=0) {
			return;  
		}
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
				 int n=s.nextInt();
		 printTillN(n);
		 

	}

}
