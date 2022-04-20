import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		boolean isALrgest=(a>=b)&&(a>=c);
		System.out.println(isALrgest);
		System.out.println((a>=b)||(a>=c));
		System.out.println(!(a>=b));
	}

}
