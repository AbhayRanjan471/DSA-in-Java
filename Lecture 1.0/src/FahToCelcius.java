import java.util.Scanner;

public class FahToCelcius {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		//int cel=(5/9)*(f-32);       //   5/9=0 that's why output is zero
		//System.out.println(cel);
        
		//int cel=(5*(f-32))/9;   //its correct
	  //  System.out.println(cel);
	    
	  //  int cel=(5.0/9)*(f-32);  // its shows error bcz we are trying to store double into integer	
		
	    int cel=(int)((5*(f-32))/9);   //its correct
	    System.out.println(cel);       //explicit form
	    
	    //Arithmatic operators
	    System.out.println(9/5);
	    System.out.println(9-5);
	    System.out.println(9%5);
	    System.out.println(9*5);
	    System.out.println('a'+3);
	    System.out.println('a'+'b');
	    char c='a';
	   // char i= c+'a';  // show error bcz we r trying to store int into char
	    
	    char i=(char)(c+3);
	    System.out.println(i);
	    byte b=50;
	    b=(byte)(b*50);
	    System.out.println(b);       /*In 2nd statement, b is multiplied with 50 
	                                 where b is byte variable and 50 is an integer. So after the
	                                    multiplication, result comes as an integer value which is 2500.
	                                   Now we are trying to assign this integer to a byte variable,
	                                   which will cause the error*/
	    double a=6/4;
	    int e=6/4;
	    double h=(a+e);
	    System.out.println(h);   /*When 6 / 4 is performed, both the operands
	                              of / are integer. Hence answer will be
	                                an int i.e. 1. When we store it in a (which is double),
	                                   value of a will be 1.0 and value of b will be 1.
	                                   Thus a + b will be 2.0*/
	    double v=55.5;
	    v=v%10;
	    System.out.println(v);
	    
	}
}
