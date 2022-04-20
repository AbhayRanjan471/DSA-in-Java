import java.util.Scanner;
public class Questions {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	       int a = 42;
	       int b = ~a ;    // (there is tilde sign before a)
	       System.out.println(a + " " + b);       
//	   
	int n=s.nextInt();
	int i=1;
	while(n>=1) {
		int d=n/2;
		int rem=n%2;
		n=d;
		i++;
		System.out.print(rem);
	}
//    int x, y=1;
//    x=10;
//    if(x!=10&&x/0==0) {
//    	System.out.println(y);
//    }
//    else
//    	System.out.println(++y);
		
//		  int x = 15;
//		    int y = x++;
//		    int  z = ++x;
//		    System.out.println(y +" " + z);
		
//		 int g = 3;
//         System.out.print(++g * 8);
		
//		 int x =10;
//	        int y = 20;
//	        if(x++ > 10 && ++y > 20 ){
//	        System.out.print("Inside if  ");
//	        }else{
//	        System.out.print("Inside else  ");
//	        }
//	        System.out.println(x +" "+y);
		
//		int x = 10;
//        int y = 20;
//        if(x++ > 10 || ++y > 20 ){
//       System.out.print("Inside if  ");
//        }else{
//       System.out.print("Inside else  ");
//        }
//        System.out.println(x  + " " + y);
		
//	int x=10;
//	//int z=x++;
//	System.out.println(x++);
//	System.out.println(x++);
//	int b=x;
//	System.out.println(++b);
////    
	}
}


