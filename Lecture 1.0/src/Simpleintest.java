import java.util.Scanner;

public class Simpleintest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();/*we can take string in this way
		                        but we cannot take char in such way*/
		System.out.println(str);
		char c=str.charAt(1); //this way we can use char
		System.out.println(c);
		char a=s.next().charAt(0);//best way to take input
		int p=s.nextInt();     //long l=s.nextlong();
		int r=s.nextInt();   //double d=s.nextdouble();
		int t=s.nextInt();
		int SI=(p*r*t)/100;
	
		System.out.println(SI);

	}

}
