package Function;

public class Pass_By_Value {
	
//	public static void increment(int n) {
//		n=n+1;
//		//here we are not returning the value of 'n' so there will be no change in the value of line
//		//line 13
//	}
//
//	public static void main(String[] args) {
//		 int a=10;
//		 increment(a);
//		 System.out.println(a);
//
//	}
	
	   // NExt question
	
//	public static int increment(int n) {
//		n=n+1;
//		return n;  //  here we r returning the value of 'n; so there we change in the line 28 bcz in line 26 we have assign a=increment(a
//		 
//	}
//
//	public static void main(String[] args) {
//		 int a=10;
//		a= increment(a);
//		 System.out.println(a);
//
//	}
	   
	   //NExt Question
	
//	public static void doubleValue(int a ){
//	    a = a * 2;
//	}
//	public static void main(String[] args) {
//	    int a = 8;
//	    doubleValue(a);
//	    System.out.println(a);
//	}
	
	    //NExt Question
	
//	public static int func(int a){
//	    a += 10;
//	    return a;
//	}
//
//	public static void main(String[] args) {
//	    int a = 5;
//	    func(a);   // here we have not initilize a=func(a) that's why after returning also the vlaue of a we will get output as 5
//	    System.out.println(a);
//	}
	
	     //NExt Questin
	
	public static int square(int a){
	    int ans = a * a;
	    return ans;
	}

	public static void main(String[] args) {
	    int a = 4;
	    a = square(a);
	    System.out.println(a);
	}

}
