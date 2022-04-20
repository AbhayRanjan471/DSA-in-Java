import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);            /*"s.next()" scans and returns the next token as String. 
                                                     A token is part of entered line that is separated
                                                     from other tokens by space, tab or newline.
                                                     So when input line is - “abc def 10” then
                                                      s.next() returns the first token as String
                                                       i.e. “abc” and s.nextInt() tries to convert
                                                        the next token i.e. “def” into an int, which
                                                              gives InputMismatchException.*/

String str=s.next();
int a=s.nextInt();


System.out.print(str+" "+a);
	}

}
